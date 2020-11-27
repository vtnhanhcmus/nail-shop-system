package com.nail.shop.mappers;

import com.nail.shop.models.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    void order(@Param("order") Orders order);
}
