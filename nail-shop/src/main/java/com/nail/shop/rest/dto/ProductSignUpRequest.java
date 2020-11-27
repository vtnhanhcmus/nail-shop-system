package com.nail.shop.rest.dto;

import lombok.Data;

@Data
public class ProductSignUpRequest {
    private String productId;
    private String productDetailId;
    private String shopId;
    private String title;
    private String description;
    private Double price;
    private Double discount;
    private String path;
    private String imageSize;
    private String categoryId;
}
