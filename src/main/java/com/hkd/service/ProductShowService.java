package com.hkd.service;

import com.hkd.domain.ProductShow;

import java.util.List;

public interface ProductShowService {
    List<ProductShow> getProductShowListByShopId(Integer id);

    Integer modifyProductShowInfoById(ProductShow productShow);

    Integer removeProductShowInfoById(Integer id);

    Integer addProductShowInfoByShopId(ProductShow productShow);
}
