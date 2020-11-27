package com.nail.shop.rest.dto;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class PasswordRequest {
    private String newPassword;
    private String repeatPassword;
    private String userId;
}
