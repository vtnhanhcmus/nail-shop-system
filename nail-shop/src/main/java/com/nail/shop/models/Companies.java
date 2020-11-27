package com.nail.shop.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Companies extends BaseModel{
  private String ownerId;
  private String name;
  private String description;
  private String imagePath;
}
