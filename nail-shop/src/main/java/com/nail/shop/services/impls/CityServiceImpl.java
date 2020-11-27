package com.nail.shop.services.impls;

import com.nail.shop.mappers.CityMapper;
import com.nail.shop.models.Cities;
import com.nail.shop.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<Cities> findByCountry(Long countryId) {
        return cityMapper.findByCountry(countryId);
    }
}
