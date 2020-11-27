package com.nail.shop.services;

import com.nail.shop.models.Cities;
import java.util.List;

public interface CityService {
    List<Cities> findByCountry(Long countryId);
}
