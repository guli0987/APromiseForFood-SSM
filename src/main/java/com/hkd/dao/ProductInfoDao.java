package com.hkd.dao;

import com.hkd.domain.ProductInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoDao {
    /**
     * 根据商店展示id查询商品详细信息
     * @param id
     * @return
     */
    ProductInfo selectProductInfo(Integer id);
}
