package com.hkd.dao;

import com.hkd.domain.ProductStock;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductStockDao {
    /**
     * 根据产品展示id获取产品库存销量信息
     * @param id
     * @return
     */
    ProductStock selectProductStockInfo(Integer id);

    /**
     * 根据产品展示id获取当前产品销量排名
     * @param id
     * @return
     */
    Integer selectProductStockRankById(Integer id);
}
