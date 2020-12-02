package com.nail.shop.services.impls;

import com.nail.shop.mappers.DistrictMapper;
import com.nail.shop.models.Districts;
import com.nail.shop.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<Districts> findByCity(String cityId) {
        return districtMapper.findByCity(cityId);
    }
}
