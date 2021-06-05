package com.hkd.service.impl;

import com.hkd.dao.ProductStockDao;
import com.hkd.domain.ProductStock;
import com.hkd.service.ProductStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductStockServiceImpl implements ProductStockService {
    @Autowired
    private ProductStockDao productStockDao;
    @Override
    public ProductStock getProductStockInfo(Integer id) {
        return productStockDao.selectProductStockInfo(id);
    }
}
