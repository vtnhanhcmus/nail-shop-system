package com.nail.shop.mappers;
import com.nail.shop.models.ProductImages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductImageMapper {
    void insert(@Param("image") ProductImages productImage);
    void update(@Param("image") ProductImages productImage);
    ProductImages findByProductImageId(@Param("productImageId") String productImageId);

}
