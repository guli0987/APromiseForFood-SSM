package com.hkd.test;

import com.hkd.controller.AreaController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {

    public static void main(String[] args) {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        /*CityController uc = (CityController) applicationContext
                .getBean("cityController");
        uc.test();*/
        /*AreaController ac = (AreaController) applicationContext
                .getBean("areaController");
        ac.test();*/
    }
}
