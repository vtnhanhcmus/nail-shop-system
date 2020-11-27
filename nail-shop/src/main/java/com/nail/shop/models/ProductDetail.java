package com.nail.shop.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail extends BaseModel{
  private String productId;
  private String title;
  private String description;
}
