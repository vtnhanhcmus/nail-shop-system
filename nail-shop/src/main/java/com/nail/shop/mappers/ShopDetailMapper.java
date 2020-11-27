package com.nail.shop.mappers;

import com.nail.shop.models.ShopDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopDetailMapper {
    void insert(@Param("shopDetail") ShopDetail shopDetail);

}
