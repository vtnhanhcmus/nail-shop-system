package com.nail.shop.mappers;

import com.nail.shop.models.UserAddresses;
import com.nail.shop.rest.dto.UserAddressRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AddressMapper {
    List<UserAddresses> findByUserProfile(@Param("user_profile_id") String userProfileId);
    void insert(@Param("address") UserAddressRequest address);
    void update(@Param("address") UserAddressRequest address);
    void delete(@Param("address_id") String addressId);
}
