package com.nail.shop.services.impls;

import com.nail.shop.models.UserNail;
import com.nail.shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SystemServiceImpl {

    @Autowired
    private UserService userService;

    public Optional<UserNail> fetchCurrentUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return userService.findByEmail(authentication.getName());
    }

}
