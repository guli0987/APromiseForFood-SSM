package com.hkd.service;

import com.hkd.domain.ProductShow;

import java.util.List;
import java.util.Map;

public interface ProductShowService {
    List<Integer> getProductShowIdListByShopId(Integer id);

    List<ProductShow> getProductShowListByShopId(Integer id);

    List<ProductShow> getProductShowListByShopIdLimitNumber(Map<String,Object> param);

    Integer modifyProductShowInfoById(ProductShow productShow);

    Integer removeProductShowInfoById(Integer id);

    Integer addProductShowInfoByShopId(ProductShow productShow);
}
