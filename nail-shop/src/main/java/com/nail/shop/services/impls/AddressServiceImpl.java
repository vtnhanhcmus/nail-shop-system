package com.nail.shop.services.impls;

import com.nail.shop.mappers.AddressMapper;
import com.nail.shop.mappers.CityMapper;
import com.nail.shop.mappers.CountryMapper;
import com.nail.shop.mappers.DistrictMapper;
import com.nail.shop.models.UserAddresses;
import com.nail.shop.rest.dto.UserAddressRequest;
import com.nail.shop.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<UserAddresses> findByUserProfile(String userProfileId) {
        return addressMapper.findByUserProfile(userProfileId);
    }

    @Override
    public void save(List<UserAddressRequest> addresses) {

        for (UserAddressRequest address : addresses){
            if (StringUtils.isEmpty(address.getUserAddressId())){
                addressMapper.insert(address);
            }else {
                addressMapper.update(address);
            }
        }

    }

    @Override
    public void delete(String addressId) {
        addressMapper.delete(addressId);
    }
}
