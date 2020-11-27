package com.nail.shop.services.impls;
import java.util.Arrays;
import java.util.Objects;

import com.nail.shop.mappers.UserMapper;
import com.nail.shop.models.UserNail;
import com.nail.shop.models.security.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ApplicationUser loadUserByUsername(String email) throws UsernameNotFoundException {
        UserNail userNailInfo = userMapper.findByEmail(email);

        if (Objects.isNull(userNailInfo)) {
            throw new UsernameNotFoundException("Could not find user");
        }

        GrantedAuthority authority = new SimpleGrantedAuthority(userNailInfo.getUserRoles().get(0).getRole());
        return new ApplicationUser(userNailInfo, Arrays.asList(authority));
    }
}
