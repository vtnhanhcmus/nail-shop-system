package com.nail.shop.services.impls;

import com.nail.shop.mappers.OrderDetailMapper;
import com.nail.shop.mappers.OrderMapper;
import com.nail.shop.mappers.ProductMapper;
import com.nail.shop.mappers.UserMapper;
import com.nail.shop.models.Orders;
import com.nail.shop.models.Products;
import com.nail.shop.models.UserNail;
import com.nail.shop.rest.dto.OrderRequest;
import com.nail.shop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void order(OrderRequest orderRequest) {

        UserNail user = userMapper.findByUserId(orderRequest.getCustomerId());
        if (Objects.isNull(user)){
            throw new RuntimeException("User not found");
        }

        Products product = productMapper.findById(orderRequest.getProductId());
        if (Objects.isNull(product)){
            throw new RuntimeException("Product not found");
        }

        Orders order = Orders.builder().customerId(user.getId()).productId(product.getId()).build();

    }

    @Override
    public Optional<Orders> findById(String orderId) {
        return Optional.empty();
    }
}
