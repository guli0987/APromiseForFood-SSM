package com.hkd.controller;

import com.alibaba.fastjson.JSON;
import com.hkd.domain.Area;
import com.hkd.service.AreaService;
import com.hkd.utils.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/area")
@Controller("areaController")
public class AreaController {
    private static final Logger logger= LoggerFactory.getLogger(ProductShowController.class);
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
        //得到区域数据
        List<Area> areas=areaService.getAreaProductShopListByCode(code);
        return Msg.success().add("result",JSON.toJSONString(areas));
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/getProductShopListLimitNumber",method = RequestMethod.GET,params = {"code","pageNum","pageSize"},headers = {})
    public Msg getAreaProductShopListLimitNumber(@RequestParam Integer code,@RequestParam Integer pageNum,@RequestParam Integer pageSize){
        pageNum=(pageNum-1)*pageSize;//第几页
        Map<String,Object> map = new HashMap<>();
        map.put("code",code);
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        //得到区域数据
        List<Area> areas=areaService.getAreaProductShopListByCodeLimitNumber(map);
        logger.debug("【debug|getProductShopListLimitNumber】"+JSON.toJSONString(areas));

        return Msg.success().add("result",JSON.toJSONString(areas));
    }

}
