package com.nail.shop.rest.dto;

import lombok.Data;

@Data
public class OwnerEmployeeRequest {
    private String ownerId;
    private String employeeId;
}
