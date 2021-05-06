package com.hkd.service;

import com.hkd.domain.ProductShop;

import java.util.List;

public interface ProductShopService {
    List<ProductShop> getProductShopById(Integer id);

    Integer modifyProductShopById(ProductShop updateShop);

    Integer addProductShop(ProductShop newShop);

    Integer removeProductShopById(Integer id);
}