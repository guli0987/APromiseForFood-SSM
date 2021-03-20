package com.hkd.controller;

import com.alibaba.fastjson.JSON;
import com.hkd.dao.AreaDao;
import com.hkd.domain.Area;
import com.hkd.domain.City;
import com.hkd.mapper.SelectAreaProductShopByCode;
import com.hkd.service.AreaService;
import com.hkd.utils.Msg;
import jdk.nashorn.internal.objects.NativeJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/area")
@Controller("areaController")
public class AreaController {
    @Autowired
    private AreaService areaService;
    /*
    value:指定请求的实际地址，指定的地址可以是URI Template 模式；
    method:指定请求的method类型， GET、POST、PUT、DELETE等；
    params:指定request中必须包含某些参数值时如code，才让该方法处理
    header:指定request中必须包含某些指定的header值，才能让该方法处理请求。
    */
    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/getProductShopList",method = RequestMethod.GET,params = {"code"},headers = {})
    public Msg getAreaProductShopList(@RequestParam Integer code){
        //System.out.println("————————————————————————————————————"+code);
        //得到区域数据
        List<Area> areas=areaService.getAreaProductShopListByCode(code);
        //System.out.println(JSON.toJSONString(areas)+"_____________________________________"+areas);
        return Msg.success().add("result",JSON.toJSONString(areas));
        //return null;
    }
    /*public void test(){
        int areaCode=1046401;
        List<Area> areas1 = areaService.selectAreaProductShopListByCode(areaCode);
        System.out.println(areas1);
        System.out.println("=============");
        List<Area> areas2 = areaService.selectAreaProductShopListByCode2(areaCode);
        System.out.println(areas2);
        System.out.println("=============");
        List<SelectAreaProductShopByCode> areas3 = areaService.selectAreaProductShopListByCode3(areaCode);
        System.out.println(areas3);
        System.out.println("=============");
    }*/

}
