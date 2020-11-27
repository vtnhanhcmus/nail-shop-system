package com.nail.shop.rest;

import com.nail.shop.rest.dto.OrderRequest;
import com.nail.shop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity order(@RequestBody OrderRequest orderRequest){
        orderService.order(orderRequest);
        return ResponseEntity.ok().build();
    }

}
