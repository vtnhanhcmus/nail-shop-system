package com.nail.shop.mappers;

import com.nail.shop.models.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    void insert(@Param("product") Products product);
    void update(@Param("product") Products product);
    Products findById(@Param("productId") String productId);
}
