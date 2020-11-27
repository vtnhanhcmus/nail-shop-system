package com.nail.shop.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDetails extends BaseModel{
  private String reservationId;
  private String serviceId;
  private String employeeId;
  private String timeId;
  private Double fee;
}
