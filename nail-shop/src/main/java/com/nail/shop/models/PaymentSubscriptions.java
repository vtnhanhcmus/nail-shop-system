package com.nail.shop.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentSubscriptions extends BaseModel{
  private String ownerId;
  private String subscriptionId;
  private Double fee;
}
