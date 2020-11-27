package com.nail.shop.models;

import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserNail extends BaseModel{
  private String username;
  private String password;
  private UserProfile userProfile;
  private List<UserRoles> userRoles;
  private List<UserAddresses> userAddresses;

}
