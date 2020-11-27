package com.nail.shop.services;

import com.nail.shop.models.UserAddresses;
import com.nail.shop.rest.dto.UserAddressRequest;

import java.util.List;

public interface AddressService {
    List<UserAddresses> findByUserProfile(String userProfileId);
    void save(List<UserAddressRequest> userAddresses);
    void delete(String addressId);
}
