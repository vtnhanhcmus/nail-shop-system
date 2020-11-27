package com.nail.shop.rest.dto;
import lombok.Data;
import java.util.List;

@Data
public class ChangeRoleRequest {
    private List<String> roles;
}
