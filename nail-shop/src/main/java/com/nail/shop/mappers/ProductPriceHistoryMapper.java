package com.nail.shop.mappers;

import com.nail.shop.models.ProductPriceHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductPriceHistoryMapper {
    void insert(@Param("price") ProductPriceHistory price);
    void update(@Param("price") ProductPriceHistory price);
    ProductPriceHistory findByProductIdAndPrice(@Param("productId") String productId, @Param("price") Double price);
}
