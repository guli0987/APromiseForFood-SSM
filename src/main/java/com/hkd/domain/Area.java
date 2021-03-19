package com.hkd.domain;

import java.util.List;

public class Area {
    /**
     * 区域序号
     */
    private Integer areaId;
    /**
     * 区域名称
     */
    private String areaName;
    /**
     * 区域代码
     */
    private Integer areaCode;
    /**
     * 获取对应区域产品商店列表
     */
    private List<ProductShop> productShopList;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public List<ProductShop> getProductShopList() {
        return productShopList;
    }

    public void setProductShopList(List<ProductShop> productShopList) {
        this.productShopList = productShopList;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName=" + areaName +
                ", areaCode=" + areaCode +
                ", productShopList=" + productShopList +
                '}';
    }
}
