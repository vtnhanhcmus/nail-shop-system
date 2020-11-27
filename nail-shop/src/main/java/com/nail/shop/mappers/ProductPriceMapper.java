package com.nail.shop.mappers;

import com.nail.shop.models.ProductPrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductPriceMapper {
    void insert(@Param("price") ProductPrice price);
    void update(@Param("price") ProductPrice price);
    ProductPrice findByProductId(@Param("productId") String productId);
}
