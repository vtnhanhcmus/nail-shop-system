package com.nail.shop.services.impls;

import com.nail.shop.mappers.CountryMapper;
import com.nail.shop.models.Countries;
import com.nail.shop.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryMapper countryMapper;

    @Override
    public List<Countries> findAll() {
        return countryMapper.findAll();
    }
}
