package com.nail.shop.rest.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserProfileRequest {
    private String profileId;
    private String firstName;
    private String lastName;
    private String password;
    private String repeatPassword;
    private Integer sex;
    private List<UserAddressRequest> addresses;
}
