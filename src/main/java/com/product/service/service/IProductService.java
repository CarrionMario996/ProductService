package com.product.service.service;

import com.product.service.model.dto.ProductDetailResponse;
import com.product.service.model.dto.ProductResponse;

import java.util.List;

public interface IProductService {
    List<ProductResponse> findAllProducts();
    ProductDetailResponse findByIdProduct(String id);
}
