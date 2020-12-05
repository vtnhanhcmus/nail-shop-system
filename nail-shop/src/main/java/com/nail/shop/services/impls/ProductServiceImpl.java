package com.nail.shop.services.impls;

import com.nail.shop.mappers.*;
import com.nail.shop.models.*;
import com.nail.shop.rest.dto.ProductSignUpRequest;
import com.nail.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ProductImageMapper productImageMapper;

    @Autowired
    private ProductPriceMapper productPriceMapper;

    @Autowired
    private ProductPriceHistoryMapper productPriceHistoryMapper;

    @Override
    public void save(ProductSignUpRequest productSignUpRequest) {

        Shops shop = shopMapper.findByShopId(productSignUpRequest.getShopId());
        if (Objects.isNull(shop)){
            throw new RuntimeException("Shop does not valid");
        }

        Categories category = categoryMapper.findByCategoryId(productSignUpRequest.getCategoryId());

        if (Objects.isNull(category)){
            throw new RuntimeException("Category does not valid");
        }

        Products product = Products.builder()
                .shopId(shop.getId())
                .build();

        ProductDetail productDetail = ProductDetail.builder()
                .title(productSignUpRequest.getTitle())
                .description(productSignUpRequest.getDescription()).build();

        ProductPrice productPrice = ProductPrice.builder()
                .price(productSignUpRequest.getPrice())
                .discount(productSignUpRequest.getDiscount()).build();

        ProductPriceHistory productPriceHistory = ProductPriceHistory.builder().price(productSignUpRequest.getPrice()).build();

        ProductImages productImage = ProductImages.builder().path(productSignUpRequest.getPath()).size(productSignUpRequest.getImageSize()).build();

        if (!StringUtils.isEmpty(productSignUpRequest.getProductId())){
            Products productEntity = productMapper.findById(productSignUpRequest.getProductId());
            if (Objects.isNull(productEntity)){
                throw new RuntimeException("Product does not valid");
            }

            productMapper.update(product);
            productDetail.setProductId(product.getId());
            productImage.setProductId(product.getId());
            productPrice.setProductId(product.getId());
            productDetailMapper.update(productDetail);
            productImageMapper.update(productImage);
            productPriceMapper.update(productPrice);

            ProductPriceHistory productPriceHistoryEntity = productPriceHistoryMapper.findByProductIdAndPrice(product.getId().toString(), productSignUpRequest.getPrice());
            if (Objects.isNull(productPriceHistoryEntity)){
                productPriceHistoryMapper.insert(productPriceHistory);
            }
            return;
        }

        productMapper.insert(product);
        productDetail.setProductId(product.getId());
        productImage.setProductId(product.getId());
        productPrice.setProductId(product.getId());
        productPriceHistory.setProductId(product.getId());
        productDetailMapper.insert(productDetail);
        productImageMapper.insert(productImage);
        productPriceMapper.insert(productPrice);
        productPriceHistoryMapper.insert(productPriceHistory);
    }



    @Override
    public void delete(String productId) {

    }

    @Override
    public List<Products> findByUserId() {
        return null;
    }

    @Override
    public Optional<Products> findById(String productId) {
        return Optional.empty();
    }
}
