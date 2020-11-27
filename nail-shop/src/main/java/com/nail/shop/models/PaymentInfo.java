package com.nail.shop.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInfo extends BaseModel{
  private String paymentTypeId;
  private String accountNumber;
  private Long secretNumber;
}
