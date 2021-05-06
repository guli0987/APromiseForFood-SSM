package com.hkd.domain;

/**
 * 店铺信息
 */
public class ProductShop {
    /**
     * 店铺id
     */
    private Integer productShopId;
    /**
     * 店铺头像
     */
    private String productShopAvatar;
    /**
     * 店铺名
     */
    private String productShopName;
    /**
     * 店铺是否热门
     */
    private Integer productShopHot;
    /**
     * 店铺宣传图
     */
    private String productShopImg;
    /**
     * 店铺额外信息
     */
    private String productShopExtra;
    /**
     * 区域码
     */
    private Integer areaCode;

    public ProductShop(Integer productShopId, String productShopAvatar, String productShopName, Integer productShopHot, String productShopImg, String productShopExtra, Integer areaCode) {
        this.productShopId = productShopId;
        this.productShopAvatar = productShopAvatar;
        this.productShopName = productShopName;
        this.productShopHot = productShopHot;
        this.productShopImg = productShopImg;
        this.productShopExtra = productShopExtra;
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

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public String toString() {
        return "ProductShop{" +
                "productShopId=" + productShopId +
                ", productShopAvatar='" + productShopAvatar + '\'' +
                ", productShopName='" + productShopName + '\'' +
                ", productShopHot=" + productShopHot +
                ", productShopImg=" + productShopImg +
                ", productShopExtra='" + productShopExtra + '\'' +
                ", areaCode=" + areaCode +
                '}';
    }
}
