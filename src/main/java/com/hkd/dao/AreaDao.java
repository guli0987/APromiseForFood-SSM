package com.hkd.dao;

import com.hkd.domain.Area;
import com.hkd.mapper.SelectAreaProductShopByCode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("areaDao")
public interface AreaDao {
    /**
     * 查询所有区域信息
     * @return
     */
    List<Area> selectAllArea();

    /**
     * 通过id查询区域信息
     * @param id
     * @return
     */
    List<Area> selectAreaById(Integer id);

    /**
     * 通过区域代码查询信息
     * @param code
     * @return
     */
    List<Area> selectAreaByCode(Integer code);

    /**
     * 通过区域码查询所属区域商店列表
     * @param code
     * @return
     */
    List<Area> selectAreaProductShopListByCode(Integer code);
    /**
     * 通过区域码查询所属区域商店列表
     * @param code
     * @return
     */
    List<Area> selectAreaProductShopListByCode2(Integer code);

    /**
     * 通过区域码查询所属区域商店列表  使用POJO存储结果
     * @param code
     * @return
     */
    List<SelectAreaProductShopByCode> selectAreaProductShopListByCode3(Integer code);
}
