package com.nail.shop.mappers;

import com.nail.shop.models.Districts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface DistrictMapper {
    List<Districts> findByCity(@Param("city_id") String cityId);
}
