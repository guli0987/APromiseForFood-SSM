package com.hkd.controller;

import com.hkd.dao.AreaHistoryDao;
import com.hkd.domain.AreaHistory;
import com.hkd.mapper.SelectAreaHistoryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller("areaHistoryController")
public class AreaHistoryController {
    @Autowired
    private AreaHistoryDao areaHistoryDao;
    public void test(){
        List<AreaHistory> areaHistories = areaHistoryDao.selectAllArea();
        System.out.println(areaHistories);
        System.out.println("=============");
    }
    public void test2(){
        SelectAreaHistoryParam selectAreaHistoryParam =new SelectAreaHistoryParam();
        selectAreaHistoryParam.setAreaTypeId(1);
        selectAreaHistoryParam.setCityId(1);
        List<AreaHistory> areaHistories = areaHistoryDao.selectAreaListByAreaTypeAndCityId(selectAreaHistoryParam);
        System.out.println(areaHistories);
        System.out.println("=============");
    }

    public void test3(){
        List<AreaHistory> areaHistories = areaHistoryDao.selectAreaListByCityId(1);
        System.out.println(areaHistories);
        System.out.println("=============");
    }
}
