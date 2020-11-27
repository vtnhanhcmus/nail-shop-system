package com.nail.shop.services;
import com.nail.shop.models.UserProfile;
import com.nail.shop.rest.dto.UserProfileRequest;

public interface UserProfileService {
    void update(UserProfileRequest request);
    UserProfile findById(String userId);
}
