package com.nail.shop.rest.dto;

import com.nail.shop.models.Gender;
import lombok.Data;

@Data
public class UserSignUpRequest {
    private Gender sex;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String password;
    private String jwtToken;
}
