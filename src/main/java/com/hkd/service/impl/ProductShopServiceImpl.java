package com.hkd.service.impl;

import com.hkd.dao.ProductShopDao;
import com.hkd.domain.ProductShop;
import com.hkd.domain.SelectAreaProductShopByCode;
import com.hkd.service.ProductShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductShopServiceImpl implements ProductShopService {
    @Autowired
    private ProductShopDao productShopDao;
    @Override
    public List<ProductShop> getProductShopById(Integer id) {
        return productShopDao.selectProductShopById(id);
    }

    @Override
    public Integer modifyProductShopById(ProductShop updateShop) {
        return productShopDao.updateProductShopById(updateShop);
    }

    @Override
    public Integer addProductShop(ProductShop newShop) {
        return productShopDao.insertProductShop(newShop);
    }

    @Override
    public Integer removeProductShopById(Integer id) {
        return productShopDao.deleteProductShopById(id);
    }

    @Override
    public SelectAreaProductShopByCode getProductShopAndAreaById(Integer id) {
        return productShopDao.selectProductShopAndAreaById(id);
    }
}
