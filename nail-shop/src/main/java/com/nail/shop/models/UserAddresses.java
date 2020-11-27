package com.nail.shop.models;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserAddresses extends BaseModel{
  private String userProfileId;
  private Cities city;
  private Countries country;
  private Districts district;
  private String streetName;
  private String userAddressId;
}
