package com.nail.shop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSessions extends BaseModel{
  private String username;
  private String userId;
  private Long expired;
  private String type;
}
