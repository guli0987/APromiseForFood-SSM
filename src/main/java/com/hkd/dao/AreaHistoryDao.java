package com.hkd.dao;

import com.hkd.domain.AreaHistory;
import com.hkd.mapper.SelectAreaHistoryParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("areaHistoryDao")
public interface AreaHistoryDao {
    /**
     * 通过区域类型id和城市id来获取相关区域信息
     * @return
     */
    List<AreaHistory> selectAreaListByAreaTypeAndCityId(SelectAreaHistoryParam param);

    /**
     * 通过城市id来获取相关区域信息
     * @param cityId
     * @return
     */
    List<AreaHistory> selectAreaListByCityId(Integer cityId);

    /**
     * 查询所有区域信息
     * @return
     */
    List<AreaHistory> selectAllArea();
}
