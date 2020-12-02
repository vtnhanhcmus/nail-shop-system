package com.nail.shop.services.impls;

import com.nail.shop.mappers.CityMapper;
import com.nail.shop.models.Cities;
import com.nail.shop.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<Cities> findByCountry(String countryId) {
        return cityMapper.findByCountry(countryId.toString());
    }
}
