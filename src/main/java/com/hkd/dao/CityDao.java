package com.hkd.dao;

import com.hkd.domain.City;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("cityDao")
public interface CityDao {
    /**
     * 获取城市列表
     * @return
     */
    List<City> selectCityList();
}
