package com.nail.shop.rest.dto;

import lombok.Data;

@Data
public class CompanySignUpRequest {
    private String companyId;
    private String companyName;
    private String description;
    private String imagePath;
}
