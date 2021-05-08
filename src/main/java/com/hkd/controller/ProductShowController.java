package com.hkd.controller;

import com.alibaba.fastjson.JSON;
import com.hkd.domain.ProductShow;
import com.hkd.service.ProductShowService;
import com.hkd.utils.Msg;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/shopShow")
public class ProductShowController {
    @Autowired
    private ProductShowService productShowService;

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/getShopShowList")
    public Msg getShopShowList(@RequestParam Integer id){
        List<ProductShow> list=productShowService.getProductShowListByShopId(id);
        System.out.println("【ProductShow】"+list.toString());
        return Msg.success().add("result", JSON.toJSONString(list));
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/modifyShopShowInfo")
    public Msg modifyShopShowInfo(@RequestParam Integer id,@RequestParam String title,@RequestParam String desc,@RequestParam String img,@RequestParam double price,@RequestParam String extra){
        ProductShow productShow=new ProductShow(id,title,desc,img,price,extra);
        Integer result=productShowService.modifyProductShowInfoById(productShow);
        return Msg.success().add("result",JSON.toJSONString(result));
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/removeShopShowInfo")
    public Msg removeShopShowInfo(@RequestParam Integer id){
        Integer result=productShowService.removeProductShowInfoById(id);
        return Msg.success().add("result",JSON.toJSONString(result));
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/addShopShowInfo")
    public Msg addShopShowInfo(@RequestParam String title,@RequestParam String desc,@RequestParam String img,@RequestParam double price,@RequestParam String extra,@RequestParam Integer sid){
        ProductShow productShow=new ProductShow(title,desc,img,price,extra,sid);
        Integer result=productShowService.addProductShowInfoByShopId(productShow);
        return Msg.success().add("result",JSON.toJSONString(result));
    }
}
