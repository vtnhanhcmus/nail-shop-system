package com.nail.shop.components;

import com.nail.shop.models.UserNail;
import com.nail.shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CoreSystemAuthentication {

    @Autowired
    private UserService userService;

    public UserNail getCurrentUser(){
        String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userService.findByEmail(email).get();
    }


}
