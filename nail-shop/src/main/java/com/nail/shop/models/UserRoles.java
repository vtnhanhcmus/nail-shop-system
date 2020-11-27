package com.nail.shop.models;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoles extends BaseModel{
  private String userId;
  private String role;
  private Long permission;
}
