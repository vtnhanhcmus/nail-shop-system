package com.nail.shop.services.impls;

import com.nail.shop.components.CoreSystemAuthentication;
import com.nail.shop.mappers.ShopDetailMapper;
import com.nail.shop.mappers.ShopMapper;
import com.nail.shop.models.ShopDetail;
import com.nail.shop.models.Shops;
import com.nail.shop.rest.dto.ShopSignUpRequest;
import com.nail.shop.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;


@Service
@Transactional(rollbackFor = Exception.class)
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private ShopDetailMapper shopDetailMapper;

    @Autowired
    private CoreSystemAuthentication coreSystemAuthentication;

    @Override
    public void insert(ShopSignUpRequest shopSignUpRequest) {

        Shops shop = Shops.builder()
                .companyId(shopSignUpRequest.getCompanyId())
                .ownerId(shopSignUpRequest.getOwnerId())
                .build();
        ShopDetail shopDetail = ShopDetail.builder()
                .title(shopSignUpRequest.getTitle())
                .description(shopSignUpRequest.getDescription())
                .logoUrl(shopSignUpRequest.getLogoUrl()).build();

        if (StringUtils.isEmpty(shopSignUpRequest.getShopId())){
            shopMapper.insert(shop);
            shopDetailMapper.insert(shopDetail);
        }

    }

    @Override
    public void update(ShopSignUpRequest shopSignUpRequest, String shopId) {

    }

    @Override
    public void delete(String shopId) {

    }

    @Override
    public List<Shops> findByUserId() {
        return null;
    }

    @Override
    public Optional<Shops> findById(String shopId) {
        return Optional.empty();
    }
}
