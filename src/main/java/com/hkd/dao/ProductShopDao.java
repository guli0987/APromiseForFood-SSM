package com.hkd.dao;

import com.hkd.domain.ProductShop;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productShopDao")
public interface ProductShopDao {
    /**
     * 通过id查询商店信息
     * @param id
     * @return
     */
    List<ProductShop> selectProductShopById(Integer id);
    /**
     * 通过area_code查询商店信息
     * @param code
     * @return
     */
    List<ProductShop> selectProductShopByAreaCode(Integer code);
}
