package com.nail.shop.rest.dto;

import lombok.Data;

@Data
public class OrderItemRequest {
    private String productId;
    private Double price;
    private Integer count;

}
