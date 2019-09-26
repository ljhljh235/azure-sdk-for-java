// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface AuthorizationCodeProvider {
    Mono<String> getAuthorizationCode(String loginUri);
}
