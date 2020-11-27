package com.nail.shop.rest.dto;

import lombok.Data;

@Data
public class UserAddressRequest {
    private String userAddressId;
    private String userId;
    private Integer cityId;
    private Integer countryId;
    private Integer districtId;
    private String streetName;
}
