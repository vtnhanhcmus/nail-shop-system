package com.nail.shop.models;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserNail{
  private String id;
  private String username;
  private String password;
  private UserProfile userProfile;
  private List<UserRoles> userRoles;
  private List<UserAddresses> userAddresses;
}
