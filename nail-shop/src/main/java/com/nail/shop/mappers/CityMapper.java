package com.nail.shop.mappers;

import com.nail.shop.models.Cities;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityMapper {
    List<Cities> findByCountry(@Param("country_id") String countryId);
}
