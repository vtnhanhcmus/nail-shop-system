package com.nail.shop.mappers;
import com.nail.shop.models.Countries;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CountryMapper {
    List<Countries> findAll();
}
