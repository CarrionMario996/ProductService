package com.product.service.service;

import com.product.service.client.IProductClient;
import com.product.service.model.dto.ProductDetailResponse;
import com.product.service.model.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  IProductService{

    @Autowired
    private IProductClient client;
    @Override
    public List<ProductResponse> findAllProducts() {
        return client.findAllProducts();
    }

    @Override
    public ProductDetailResponse findByIdProduct(String id) {
        return client.findByIdProduct(id);
    }
}
