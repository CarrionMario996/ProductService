package com.product.service.controller;

import com.product.service.exception.RequestException;
import com.product.service.model.dto.ProductDetailResponse;
import com.product.service.model.dto.ProductResponse;
import com.product.service.service.IProductService;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0.0/product")
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping("/all")
    public ResponseEntity<?>findAllProduct(){
        List<ProductResponse>resultado;
        try {
            resultado=service.findAllProducts();
        }catch (FeignException ex){
            throw new RequestException(ex.getMessage(),ex.status(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findByIdProduct(@PathVariable String id){
        ProductDetailResponse resultado;
        try {
            resultado=service.findByIdProduct(id);
        }catch (FeignException ex){
            throw new RequestException(ex.getMessage(),ex.status(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(resultado);
    }
}
