package com.nail.shop.mappers;

import com.nail.shop.models.UserProfile;
import com.nail.shop.rest.dto.UserProfileRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserProfileMapper {
    void insert(@Param("userProfile") UserProfile userProfile);
    UserProfile update(@Param("profile") UserProfileRequest profile);
    UserProfile findInfoById(@Param("userId") String userId);
}
