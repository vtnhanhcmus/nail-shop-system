package com.nail.shop.rest.dto;

import lombok.Data;



@Data
public class ShopSignUpRequest {
    private String shopId;
    private String ownerId;
    private Long companyId;
    private String title;
    private String description;
    private String logoUrl;
}
