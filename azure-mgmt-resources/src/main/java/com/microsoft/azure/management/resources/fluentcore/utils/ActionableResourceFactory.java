/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.utils;

import com.google.common.collect.Lists;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;
import rx.functions.Func1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

public class ActionableResourceFactory<A extends ActionableResource, T> implements InvocationHandler {
    private Class<A> actionable;
    private T impl;

    private ActionableResourceFactory(Class<A> actionable, T impl) {
        this.actionable = actionable;
        this.impl = impl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // List methods to forward
        List<Method> declaredMethods = Lists.newArrayList(actionable.getDeclaredMethods());
        String methodName = method.getName();
        // Append 'Async' to synchronous action
        if (declaredMethods.contains(method) && !methodName.endsWith("Async")) {
            methodName = methodName + "Async";
        }
        // Remove callback for ServiceCall based action
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length > 0 && parameterTypes[parameterTypes.length - 1].getName().contains("Callback")) {
            parameterTypes = Arrays.copyOfRange(parameterTypes, 0, parameterTypes.length - 1);
        }
        // Find implementation method
        Method implMethod = impl.getClass().getMethod(methodName, parameterTypes);
        implMethod.setAccessible(true);

        if (!declaredMethods.contains(method)) {
            return implMethod.invoke(impl, args);
        } else if (method.getName().contains("Async") && method.getReturnType().getName().contains("ServiceCall")) {
            Observable<?> observable = (Observable<?>) implMethod.invoke(impl, args);
            return ServiceCall.create(
                    observable.map(new Func1<Object, ServiceResponse<Object>>() {
                        @Override
                        public ServiceResponse<Object> call(Object o) {
                            return null;
                        }
                    }), (ServiceCallback<Object>) args[args.length - 1]);
        } else if (!method.getName().contains("Async")) {
            Observable<?> observable = (Observable<?>) implMethod.invoke(impl, args);
            return observable.toBlocking().last();
        } else {
            throw new NoSuchMethodException("Unknown method " + method.getName());
        }
    }

    @SuppressWarnings("unchecked")
    public static <T, A extends ActionableResource> A newInstance(Class<A> actionable, T impl) {
        return (A) Proxy.newProxyInstance(actionable.getClassLoader(), new Class[] { actionable }, new ActionableResourceFactory<>(actionable, impl));
    }
}
