package com.nail.shop.rest;

import com.nail.shop.rest.dto.ProductSignUpRequest;
import com.nail.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/register")
    public ResponseEntity signUp(@RequestBody ProductSignUpRequest productSignUpRequest){
        productService.save(productSignUpRequest);
        return ResponseEntity.ok().build();
    }

}
