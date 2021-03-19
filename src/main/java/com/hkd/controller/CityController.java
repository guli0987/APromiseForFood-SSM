package com.hkd.controller;

import com.hkd.domain.City;
import com.hkd.service.CityService;
import com.hkd.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
@Controller("cityController")
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<City> cities=cityService.getCityList();
        model.addAttribute("cityList",cities);
        return "/cityList";//在视图解析器中配置了前缀后缀
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/jsonCity",method = RequestMethod.GET,params = {},headers = {"Host=localhost:8080"})
    public Msg returnJSON(){
        System.out.println("请求json数据");
        //得到城市数据
        List<City> cities=cityService.getCityList();

        return Msg.success().add("result",cities);
    }
    public void test(){
        List<City> cities=cityService.getCityList();
        System.out.println(cities);
        System.out.println("==================================");
    }
}
