package com.hkd.dao;

import com.hkd.domain.ProductShow;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductShowDao {
    /**
     * 根据商店id查询商品展示信息列表
     * @param id
     * @return
     */
    List<ProductShow> selectProductShowListByShopId(Integer id);

    /**
     * 根据商店id查询商品展示信息列表，并限制每页数量
     * param中有三个参数，分别是id,pageNum,pageSize
     * @param param
     * @return
     */
    List<ProductShow> selectProductShowListByShopIdLimitNumber(Map<String,Object> param);

    /**
     * 根据商品id查询商品更新信息
     * @param productShow
     * @return
     */
    Integer updateProductShowInfoById(ProductShow productShow);

    /**
     * 根据商品id删除商品信息
     * @param id
     * @return
     */
    Integer deleteProductShowInfoById(Integer id);

    /**
     * 根据店铺id插入新的商品信息
     * @param productShow
     * @return
     */
    Integer insertProductShowInfoByShopId(ProductShow productShow);
}
