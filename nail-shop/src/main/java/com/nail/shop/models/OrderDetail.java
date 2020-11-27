package com.nail.shop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail extends BaseModel{
  private String orderId;
  private String productId;
  private Long status;
}
