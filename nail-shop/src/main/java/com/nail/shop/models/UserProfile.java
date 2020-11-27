package com.nail.shop.models;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile extends BaseModel{
  private String userId;
  private String firstName;
  private String lastName;
  private Long sex;
  private List<UserAddresses> userAddresses;
}
