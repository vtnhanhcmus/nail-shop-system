package com.nail.shop.rest.dto;

import lombok.Data;

@Data
public class OrderRequest {
    private String customerId;
    private String shopId;
    private String orderId;
    private String productId;
    private Long status;
}
