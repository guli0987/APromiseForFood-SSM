package com.hkd.controller;

import com.alibaba.fastjson.JSON;
import com.hkd.domain.ProductShop;
import com.hkd.domain.SelectAreaProductShopByCode;
import com.hkd.service.ProductShopService;
import com.hkd.utils.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RequestMapping("/shop")
@Controller
public class ProductShopController {
    private static final Logger logger= LoggerFactory.getLogger(ProductShowController.class);
    @Autowired
    private ProductShopService productShopService;

    /**
     * 根据id查询相关店铺信息
     * @param id
     * @return
     */
    @RequestMapping(value="/getShopInfo",method = {RequestMethod.GET},params = {},headers = {})
    @ResponseBody
    @CrossOrigin
    public Msg getShopInfoById(Integer id){
        List<ProductShop> data=productShopService.getProductShopById(id);
        logger.debug("【debug|getShopInfo】"+data.toString());
        return Msg.success().add("result", JSON.toJSONString(data));
    }

    /**
     * 根据id查询相关店铺信息,同时查询区域信息
     * @param id
     * @return
     */
    @RequestMapping(value="/getShopAndAreaInfo",method = {RequestMethod.GET},params = {},headers = {})
    @ResponseBody
    @CrossOrigin
    public Msg getShopAndAreaInfoById(Integer id){//返回单条数据，不是getShopInfoById一样的列表，所以前端无须取[0]，要长记性
        SelectAreaProductShopByCode data=productShopService.getProductShopAndAreaById(id);
        logger.debug("【debug|getShopAndAreaInfo】"+data.toString());
        return Msg.success().add("result", JSON.toJSONString(data));
    }

    /**
     * 修改店铺信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/modifyShopInfo",method = {RequestMethod.GET},params = {})
    @ResponseBody
    @CrossOrigin
    public Msg modifyShopInfo(@RequestParam Integer id,@RequestParam String avatar,@RequestParam String name,@RequestParam Integer hot,@RequestParam String img,@RequestParam String extra) throws UnsupportedEncodingException {
        String imgList= URLDecoder.decode(img,"UTF-8");
        ProductShop productShop=new ProductShop(id,avatar,name,hot,imgList,extra,-1);
        Integer result=productShopService.modifyProductShopById(productShop);
        logger.debug("【debug|modifyShopInfo】"+JSON.toJSONString(result));
        return Msg.success().add("result",JSON.toJSONString(result));
    }

    /**
     * 删除店铺
     * @param id
     * @return
     */
    @RequestMapping(value = "removeShop",method = {RequestMethod.GET},params = {},headers = {})
    @ResponseBody
    public Msg removeShop(@RequestParam Integer id){
        Integer result=productShopService.removeProductShopById(id);
        logger.debug("【debug|removeShop】"+JSON.toJSONString(result));
        return Msg.success().add("result",JSON.toJSONString(result));
    }

    /**
     * 添加店铺
     * @param avatar
     * @param name
     * @param hot
     * @param img
     * @param extra
     * @param areaCode
     * @return
     */
    @RequestMapping(value = "addShop",method = {RequestMethod.GET},params = {},headers = {})
    @ResponseBody
    public Msg addShop(@RequestParam String avatar,@RequestParam String name,@RequestParam Integer hot,@RequestParam String img,@RequestParam String extra,@RequestParam Integer areaCode){
        ProductShop productShop=new ProductShop(-1,avatar,name,hot,img,extra,areaCode);
        Integer result=productShopService.addProductShop(productShop);
        return Msg.success().add("result",JSON.toJSONString(result));
    }


}
