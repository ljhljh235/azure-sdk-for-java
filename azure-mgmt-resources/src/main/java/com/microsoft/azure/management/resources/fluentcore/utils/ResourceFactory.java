/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.utils;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;
import rx.functions.Func1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ResourceFactory<T> implements InvocationHandler {
    private T impl;

    private ResourceFactory(T impl) {
        this.impl = impl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (!method.getName().contains("Async")) {
            methodName += "Async";
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length > 0 && parameterTypes[parameterTypes.length - 1].getName().contains("Callback")) {
            parameterTypes = Arrays.copyOfRange(parameterTypes, 0, parameterTypes.length - 1);
        }
        Method implMethod = impl.getClass().getMethod(methodName, parameterTypes);
        implMethod.setAccessible(true);

        if (method.getName().contains("Async") && method.getReturnType().getName().contains("Observable")) {
            return implMethod.invoke(proxy, args);
        } else if (method.getName().contains("Async") && method.getReturnType().getName().contains("ServiceCall")) {
            Observable<?> observable = (Observable<?>) implMethod.invoke(proxy, args);
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
        return (A) Proxy.newProxyInstance(actionable.getClassLoader(), new Class[] { actionable }, new ResourceFactory<>(impl));
    }
}
