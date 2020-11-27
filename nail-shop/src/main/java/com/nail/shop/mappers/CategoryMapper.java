package com.nail.shop.mappers;

import com.nail.shop.models.Categories;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryMapper {
    void insert(@Param("category") Categories category);
    Categories findByCategoryId(@Param("categoryId") String categoryId);

}
