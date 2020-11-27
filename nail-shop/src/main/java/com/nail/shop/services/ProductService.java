package com.nail.shop.services;

import com.nail.shop.models.Products;
import com.nail.shop.rest.dto.ProductSignUpRequest;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void save(ProductSignUpRequest productSignUpRequest);
    void delete(String productId);
    List<Products> findByUserId();
    Optional<Products> findById(String productId);
}
