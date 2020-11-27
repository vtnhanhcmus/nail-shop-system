package com.nail.shop.services.impls;

import com.nail.shop.mappers.AddressMapper;
import com.nail.shop.mappers.UserMapper;
import com.nail.shop.mappers.UserProfileMapper;
import com.nail.shop.mappers.UserRolesMapper;
import com.nail.shop.models.UserNail;
import com.nail.shop.models.UserProfile;
import com.nail.shop.models.UserRoles;
import com.nail.shop.models.permission.UserRole;
import com.nail.shop.rest.dto.ChangeRoleRequest;
import com.nail.shop.rest.dto.PasswordRequest;
import com.nail.shop.rest.dto.UserSignUpRequest;
import com.nail.shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private UserProfileMapper userProfileMapper;

    @Autowired
    private UserRolesMapper userRolesMapper;

    @Override
    public Optional<UserNail> signUp(UserSignUpRequest userSignUpRequest) {

        UserNail userNail = UserNail.builder()
                .username(userSignUpRequest.getEmail())
                .password(new BCryptPasswordEncoder().encode(userSignUpRequest.getPassword())).build();
        userNail.setId(UUID.randomUUID().toString());
        userMapper.insert(userNail);

        UserProfile userProfile = UserProfile.builder()
                .firstName(userSignUpRequest.getFirstName())
                .lastName(userSignUpRequest.getLastName())
                .userId(userNail.getId())
                .sex(Long.valueOf(1))
                .build();

        userProfile.setId(UUID.randomUUID().toString());
        userProfileMapper.insert(userProfile);
        userNail.setUserProfile(userProfile);
        UserRoles userRoles = UserRoles.builder().userId(userNail.getId()).role(UserRole.ADMIN.name()).build();
        userRolesMapper.insert(userRoles);
        userNail = userMapper.findByUserId(userNail.getId().toString());
        return Optional.of(userNail);
    }

    @Override
    public void delete(String userId) {
        userMapper.delete(userId);
    }

    @Override
    public Optional<UserNail> findByEmail(String email) {
        return Optional.of(userMapper.findByEmail(email));
    }

    @Override
    public Optional<UserNail> changePassword(String userId, PasswordRequest passwordRequest) {
        userMapper.updatePassword(passwordRequest);
        return Optional.of(userMapper.findByUserId(userId));
    }

    @Override
    public Optional<UserNail> changeRole(String userId, ChangeRoleRequest changeRoleRequest) {
        changeRoleRequest.getRoles().stream().forEach(role -> userRolesMapper.update(role, userId));
        return Optional.of(userMapper.findByUserId(userId));
    }

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }


    @Override
    public List<UserNail> findAll() {
        return null;
    }

    @Override
    public UserNail findByUserId(String userId) {
        return userMapper.findByUserId(userId);
    }
}
