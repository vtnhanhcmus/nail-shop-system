package com.nail.shop.services.impls;

import com.nail.shop.models.security.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class CurrentLoginServiceImpl {

    public String currentUserLogin(){

        return String.valueOf(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

}
