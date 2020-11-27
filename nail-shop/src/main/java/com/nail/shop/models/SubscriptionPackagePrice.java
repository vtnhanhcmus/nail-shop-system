package com.nail.shop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionPackagePrice extends BaseModel{
  private String name;
  private String description;
  private Double price;
  private Long months;

}
