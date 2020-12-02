package com.nail.shop.services;

import com.nail.shop.models.Cities;
import java.util.List;
import java.util.UUID;

public interface CityService {
    List<Cities> findByCountry(String countryId);
}
