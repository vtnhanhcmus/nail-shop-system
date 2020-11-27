package com.nail.shop.services.impls;

import com.google.gson.Gson;
import com.nail.shop.mappers.AddressMapper;
import com.nail.shop.mappers.UserMapper;
import com.nail.shop.mappers.UserProfileMapper;
import com.nail.shop.models.UserProfile;
import com.nail.shop.rest.dto.PasswordRequest;
import com.nail.shop.rest.dto.UserProfileRequest;
import com.nail.shop.services.AddressService;
import com.nail.shop.services.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileMapper userProfileMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CurrentLoginServiceImpl currentLoginService;

    @Override
    public void update(UserProfileRequest request) {

        System.out.println(new Gson().toJson(currentLoginService.currentUserLogin()));

        if (StringUtils.isEmpty(request.getPassword())){
            userMapper.updatePassword(PasswordRequest.builder().userId("").newPassword(request.getPassword()).repeatPassword(request.getRepeatPassword()).build());
        }

        userProfileMapper.update(request);
        addressService.save(request.getAddresses());
    }

    @Override
    public UserProfile findById(String userId) {
        return userProfileMapper.findInfoById(userId);
    }
}
