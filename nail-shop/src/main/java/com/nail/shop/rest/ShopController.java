package com.nail.shop.rest;
import com.nail.shop.rest.dto.ShopSignUpRequest;
import com.nail.shop.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("/register")
    public ResponseEntity signUp(@RequestBody ShopSignUpRequest shopSignUpRequest){
        shopService.insert(shopSignUpRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping("{shopId}/update")
    public ResponseEntity signUp(@PathVariable("shopId") String shopId, @RequestBody ShopSignUpRequest shopSignUpRequest){
        shopService.update(shopSignUpRequest, shopId);
        return ResponseEntity.ok().build();
    }

}
