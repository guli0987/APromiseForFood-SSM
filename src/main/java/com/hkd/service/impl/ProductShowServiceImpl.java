package com.hkd.service.impl;

import com.hkd.dao.ProductShowDao;
import com.hkd.domain.ProductShow;
import com.hkd.service.ProductShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductShowServiceImpl implements ProductShowService {
    @Autowired
    private ProductShowDao productShowDao;

    @Override
    public List<Integer> getProductShowIdListByShopId(Integer id) {
        return productShowDao.selectProductShowIdListByShopId(id);
    }

    @Override
    public List<ProductShow> getProductShowListByShopId(Integer id) {
        return productShowDao.selectProductShowListByShopId(id);
    }

    @Override
    public List<ProductShow> getProductShowListByShopIdLimitNumber(Map<String, Object> param) {
        return productShowDao.selectProductShowListByShopIdLimitNumber(param);
    }

    @Override
    public Integer modifyProductShowInfoById(ProductShow productShow) {
        return productShowDao.updateProductShowInfoById(productShow);
    }

    @Override
    public Integer removeProductShowInfoById(Integer id) {
        return productShowDao.deleteProductShowInfoById(id);
    }

    @Override
    public Integer addProductShowInfoByShopId(ProductShow productShow) {
        return productShowDao.insertProductShowInfoByShopId(productShow);
    }

}
