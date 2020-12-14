package com.nail.shop.services;
import com.nail.shop.models.UserNail;
import com.nail.shop.rest.dto.ChangeRoleRequest;
import com.nail.shop.rest.dto.PasswordRequest;
import com.nail.shop.rest.dto.UserSignUpRequest;

import java.util.Optional;

public interface UserService{
    void signUp(UserSignUpRequest userSignUpRequest);
    void delete(String userId);
    Optional<UserNail> findByEmail(String email);
    UserNail findByUserId(String userId);
    void changePassword(String userId, PasswordRequest passwordRequest);
    Optional<UserNail> changeRole(String userId, ChangeRoleRequest roleRequest);
}
