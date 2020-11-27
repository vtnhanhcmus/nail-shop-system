package com.nail.shop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transactions extends BaseModel{
  private Long status;
  private String paymentId;
  private String userId;
  private Double fee;
}
