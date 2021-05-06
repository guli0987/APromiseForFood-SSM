package com.hkd.dao;

import com.hkd.domain.ProductShop;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productShopDao")
public interface ProductShopDao {
    /**
     * 通过店铺id查询商店信息
     * @param id
     * @return
     */
    List<ProductShop> selectProductShopById(Integer id);

    /**
     * 通过店铺id更新商店信息
     * @param updateShop
     * @return
     */
    Integer updateProductShopById(ProductShop updateShop);

    /**
     * 新增店铺
     * @param newShop
     * @return
     */
    Integer insertProductShop(ProductShop newShop);

    /**
     * 根据店铺id删除店铺信息
     * @param id
     * @return
     */
    Integer deleteProductShopById(Integer id);

    /**
     * 通过area_code查询商店列表（级联）
     * @param code
     * @return
     */
    List<ProductShop> selectProductShopByAreaCode(Integer code);
}
