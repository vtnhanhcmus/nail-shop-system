package com.nail.shop.services;
import com.nail.shop.models.Shops;
import com.nail.shop.rest.dto.ShopSignUpRequest;

import java.util.List;
import java.util.Optional;


public interface ShopService {
    void insert(ShopSignUpRequest shopSignUpRequest);
    void update(ShopSignUpRequest shopSignUpRequest, String shopId);
    void delete(String shopId);
    List<Shops> findByUserId();
    Optional<Shops> findById(String shopId);
}
