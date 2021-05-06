package com.hkd.test;

import com.hkd.dao.ProductShopDao;
import com.hkd.domain.ProductShop;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    public static void main(String[] args) {
        String resource="mybatis-config.xml";
        InputStream inputStream= null;
        SqlSessionFactory sqlSessionFactory =null;
        SqlSession sqlSession=null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession=sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*CityDao cityDao=sqlSession.getMapper(CityDao.class);
        List<City> cities=cityDao.selectCityList();
        System.out.println(cities);
        AreaDao areaDao=sqlSession.getMapper(AreaDao.class);
        List<Area> cities=areaDao.selectAllAreas();
        System.out.println(cities);*/
        /*ProductShopDao productShopDao=sqlSession.getMapper(ProductShopDao.class);
        ProductShop productShop= (ProductShop) productShopDao.selectProductShopById(1);
        System.out.println(productShop);*/
        sqlSession.close();

    }
}
