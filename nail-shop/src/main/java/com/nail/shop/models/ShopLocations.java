package com.nail.shop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopLocations extends BaseModel{
  private Double longtitude;
  private Double latitude;
  private String address;
}
