package com.product.service.controller;

import com.product.service.client.IProductClient;
import com.product.service.model.dto.ProductDetailResponse;
import com.product.service.model.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0.0/product")
public class ProductController {

    @Autowired
    private IProductClient client;

    @GetMapping
    public List<ProductResponse> findAllProduct(){
        return client.findAllProducts();
    }

    @GetMapping("/{id}")
    public ProductDetailResponse findByIdProduct(@PathVariable String id){
        return client.findByIdProduct(id);
    }
}
