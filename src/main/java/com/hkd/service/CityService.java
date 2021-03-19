package com.hkd.service;

import com.hkd.domain.City;

import java.util.List;

public interface CityService {
    /**
     * 获取城市列表
     * @return
     */
    public List<City> getCityList();
}
