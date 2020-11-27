package com.nail.shop.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeWorkingTime extends BaseModel{
  private String employeeId;
  private String timeId;
}
