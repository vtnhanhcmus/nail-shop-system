package com.nail.shop.rest;

import com.nail.shop.models.UserNail;
import com.nail.shop.models.UserProfile;
import com.nail.shop.rest.dto.*;
import com.nail.shop.services.AddressService;
import com.nail.shop.services.UserProfileService;
import com.nail.shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private AddressService addressService;

    @PostMapping("/signUp")
    public ResponseEntity signUp(@RequestBody @Valid UserSignUpRequest userSignUpRequest){
        userService.signUp(userSignUpRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserNail> detail(@PathVariable("userId") String userId){
        UserNail userNail = userService.findByUserId(userId);
        return ResponseEntity.ok().body(userNail);
    }

    @PostMapping("/{userId}/changePassword")
    public ResponseEntity<UserNail> updateUserPassword(@RequestBody PasswordRequest passwordRequest, @PathVariable("userId") String userId) {
        userService.changePassword(userId, passwordRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{userId}/changeRole")
    public ResponseEntity<UserNail> updateUserRole(@RequestBody ChangeRoleRequest roleRequest, @PathVariable String userId) {
        Optional<UserNail> userNail = userService.changeRole(userId,roleRequest);
        return ResponseEntity.ok().body(userNail.get());
    }

    @PostMapping("/profile")
    public ResponseEntity<UserProfile> updateProfile(@RequestBody UserProfileRequest request) {
        userProfileService.update(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{profileId}/profile")
    public ResponseEntity<UserProfile> getProfile(@PathVariable("profileId") String profileId){
        return ResponseEntity.ok(userProfileService.findById(profileId));
    }

    @PostMapping(value = "/{userId}/address/create")
    public ResponseEntity createUserAddress(@RequestBody List<UserAddressRequest> addressRequests, @PathVariable("userId") String userId){
        addressService.save(addressRequests);
        return ResponseEntity.ok().build();
    }
}
