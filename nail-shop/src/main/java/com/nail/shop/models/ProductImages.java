package com.nail.shop.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductImages extends BaseModel{
  private String path;
  private String size;
  private String productId;

}
