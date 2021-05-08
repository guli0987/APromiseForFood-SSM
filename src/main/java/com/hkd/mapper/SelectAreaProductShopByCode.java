package com.hkd.mapper;


public class SelectAreaProductShopByCode {

    private Integer areaId;
    private String areaName;
    private Integer areaCode;
    private Integer productShopId;
    private String productShopAvatar;
    private String productShopName;
    private Integer productShopHot;
    private String productShopImg;
    private String productShopExtra;

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

    public Integer getProductShopId() {
        return productShopId;
    }

    public void setProductShopId(Integer productShopId) {
        this.productShopId = productShopId;
    }

    public String getProductShopAvatar() {
        return productShopAvatar;
    }

    public void setProductShopAvatar(String productShopAvatar) {
        this.productShopAvatar = productShopAvatar;
    }

    public String getProductShopName() {
        return productShopName;
    }

    public void setProductShopName(String productShopName) {
        this.productShopName = productShopName;
    }

    public Integer getProductShopHot() {
        return productShopHot;
    }

    public void setProductShopHot(Integer productShopHot) {
        this.productShopHot = productShopHot;
    }

    public String getProductShopImg() {
        return productShopImg;
    }

    public void setProductShopImg(String productShopImg) {
        this.productShopImg = productShopImg;
    }

    public String getProductShopExtra() {
        return productShopExtra;
    }

    public void setProductShopExtra(String productShopExtra) {
        this.productShopExtra = productShopExtra;
    }

    @Override
    public String toString() {
        return "SelectAreaProductShopByCode{" +
                "areaId=" + areaId +
                ", areaName=" + areaName +
                ", areaCode=" + areaCode +
                ", productShopId=" + productShopId +
                ", productShopAvatar='" + productShopAvatar + '\'' +
                ", productShopName='" + productShopName + '\'' +
                ", productShopHot=" + productShopHot +
                ", productShopImg=" + productShopImg +
                ", productShopExtra='" + productShopExtra + '\'' +
                '}';
    }
}
