package com.product.service.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;

public class ProductConfig implements RequestInterceptor {

    private static final String TOKEN = "user-agent";
    @Value("${product-api.app-token}")
    private String token;




    @Override
    public void apply(RequestTemplate template) {

        template.header(TOKEN, token);


    }
}
