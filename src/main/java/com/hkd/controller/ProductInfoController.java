package com.hkd.controller;

import com.alibaba.fastjson.JSON;
import com.hkd.dao.ProductInfoDao;
import com.hkd.domain.ProductInfo;
import com.hkd.domain.ProductStock;
import com.hkd.service.ProductInfoService;
import com.hkd.service.ProductStockService;
import com.hkd.utils.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("product")
public class ProductInfoController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductStockService productStockService;
    private static final Logger logger= LoggerFactory.getLogger(ProductInfoController.class);
    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/getProductInfo",method = RequestMethod.GET,params = {"id"},headers = {})
    public Msg getProductInfo(@RequestParam Integer id){
        ProductInfo productInfo=productInfoService.getProductInfo(id);
        logger.debug("【debug|getProductInfo】:"+productInfo.toString());

        return Msg.success().add("result", JSON.toJSONString(productInfo));
    }
    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/getProductStockInfo",method = RequestMethod.GET,params = {"id"},headers = {})
    public Msg getProductStockInfo(@RequestParam Integer id){
        ProductStock productStock=productStockService.getProductStockInfo(id);
        logger.debug("【debug|getProductStockInfo】:"+productStock.toString());

        return Msg.success().add("result", JSON.toJSONString(productStock));
    }
}
