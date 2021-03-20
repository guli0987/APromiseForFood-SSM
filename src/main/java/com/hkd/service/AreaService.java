package com.hkd.service;

import com.hkd.domain.Area;

import java.util.List;
import java.util.Map;

public interface AreaService {
    List<Area> getAllArea();
    List<Area> getAreaById(Integer id);
    List<Area> getAreaByCode(Integer code);
    List<Area> getAreaProductShopListByCode(Integer code);
    List<Area> getAreaProductShopListByCodeLimitNumber(Map<String,Object> param);
}
