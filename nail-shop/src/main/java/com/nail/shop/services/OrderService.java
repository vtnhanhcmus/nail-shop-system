package com.nail.shop.services;

import com.nail.shop.models.Orders;
import com.nail.shop.rest.dto.OrderRequest;

import java.util.Optional;

public interface OrderService {
    void order(OrderRequest orderRequest);
    Optional<Orders> findById(String orderId);
}
