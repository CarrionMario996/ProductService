package com.product.service.client;

import com.product.service.model.dto.ProductDetailResponse;
import com.product.service.model.dto.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url="${product-api.path}" , name="ProductApi", configuration = ProductConfig.class)
public interface IProductClient {
    @GetMapping("/products")
    List<ProductResponse> findAllProducts();
    @GetMapping("/products/{id}")
    ProductDetailResponse findByIdProduct(@PathVariable String id);
}
