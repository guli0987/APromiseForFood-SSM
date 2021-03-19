package com.hkd.controller;

import com.hkd.dao.AreaDao;
import com.hkd.domain.Area;
import com.hkd.mapper.SelectAreaProductShopByCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("areaController")
public class AreaController {
    @Autowired
    private AreaDao areaDao;
    public void test(){
        int areaCode=1046401;
        List<Area> areas1 = areaDao.selectAreaProductShopListByCode1(areaCode);
        System.out.println(areas1);
        System.out.println("=============");
        List<Area> areas2 = areaDao.selectAreaProductShopListByCode2(areaCode);
        System.out.println(areas2);
        System.out.println("=============");
        List<SelectAreaProductShopByCode> areas3 = areaDao.selectAreaProductShopListByCode3(areaCode);
        System.out.println(areas3);
        System.out.println("=============");
    }

}
