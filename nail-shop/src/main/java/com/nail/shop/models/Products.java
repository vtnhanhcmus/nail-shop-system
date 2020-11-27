package com.nail.shop.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Products extends BaseModel{
  private String shopId;
  private String productDetailId;
  private String categoryId;
  private String subCategoryId;
}
