package com.nail.shop.services;
import com.nail.shop.models.Districts;
import java.util.List;

public interface DistrictService {
    List<Districts> findByCity(String cityId);
}
