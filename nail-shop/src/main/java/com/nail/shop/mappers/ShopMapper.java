package com.nail.shop.mappers;

import com.nail.shop.models.Shops;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopMapper {
    void insert(@Param("shop") Shops shop);
    Shops findByShopId(@Param("shopId") String shopId);
}
