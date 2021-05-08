package com.hkd.controller;

import com.alibaba.fastjson.JSON;
import com.hkd.utils.CosUtil;
import com.hkd.utils.Msg;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/utils")
@Controller
public class UtilsController {
    @RequestMapping(value = "/getCosTmp",method = {RequestMethod.GET},params = {},headers = {})
    @ResponseBody
    @CrossOrigin
    public Msg getTmpKey(){
        CosUtil cos=new CosUtil();
        JSONObject jsonObject=cos.getTmpKey();
        cos=null;
        return Msg.success().add("result", JSON.toJSONString(jsonObject));
    }
}
