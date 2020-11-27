package com.nail.shop.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkingTimesHistory extends BaseModel{
  private String employeeId;
  private String employeeWorkTimeId;
  private LocalDate dateWorking;
}
