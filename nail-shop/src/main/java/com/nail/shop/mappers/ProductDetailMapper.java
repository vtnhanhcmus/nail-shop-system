package com.nail.shop.mappers;

import com.nail.shop.models.ProductDetail;
import com.nail.shop.models.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductDetailMapper {
    void insert(@Param("detail") ProductDetail productDetail);
    void update(@Param("detail") ProductDetail detail);
    Products findById(@Param("productDetailId") String productDetailId);
}
