package com.hkd.service.impl;

import com.hkd.dao.ProductInfoDao;
import com.hkd.domain.ProductInfo;
import com.hkd.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Override
    public ProductInfo getProductInfo(Integer id) {
        return productInfoDao.selectProductInfo(id);
    }
}
