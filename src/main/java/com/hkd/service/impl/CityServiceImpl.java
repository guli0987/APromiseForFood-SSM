package com.hkd.service.impl;

import com.hkd.dao.CityDao;
import com.hkd.domain.City;
import com.hkd.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public List<City> getCityList() {
        return cityDao.selectCityList();
    }
}
