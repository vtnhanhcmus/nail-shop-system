package com.nail.shop.services;
import com.nail.shop.models.UserNail;
import com.nail.shop.rest.dto.ChangeRoleRequest;
import com.nail.shop.rest.dto.PasswordRequest;
import com.nail.shop.rest.dto.UserSignUpRequest;

import java.util.List;
import java.util.Optional;

public interface UserService{
    Optional<UserNail> signUp(UserSignUpRequest userSignUpRequest);
    List<UserNail> findAll();
    void delete(String userId);
    Optional<UserNail> findByEmail(String email);
    UserNail findByUserId(String userId);
    Optional<UserNail> changePassword(String userId, PasswordRequest passwordRequest);
    Optional<UserNail> changeRole(String userId, ChangeRoleRequest roleRequest);
}
