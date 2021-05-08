package com.hkd.domain;

/**
 * 店铺商品展示信息
 */
public class ProductShow {
    private Integer productShowId;
    private String productShowTitle;
    private String productShowDesc;
    private String productShowImg;
    private double productShowPrice;
    private String productShowExtra;
    private Integer productShopId;

    public ProductShow(Integer productShowId, String productShowTitle, String productShowDesc, String productShowImg, double productShowPrice, String productShowExtra) {
        this.productShowId = productShowId;
        this.productShowTitle = productShowTitle;
        this.productShowDesc = productShowDesc;
        this.productShowImg = productShowImg;
        this.productShowPrice = productShowPrice;
        this.productShowExtra = productShowExtra;
    }

    public ProductShow(String productShowTitle, String productShowDesc, String productShowImg, double productShowPrice, String productShowExtra, Integer productShopId) {
        this.productShowTitle = productShowTitle;
        this.productShowDesc = productShowDesc;
        this.productShowImg = productShowImg;
        this.productShowPrice = productShowPrice;
        this.productShowExtra = productShowExtra;
        this.productShopId = productShopId;
    }

    public ProductShow(Integer productShowId, String productShowTitle, String productShowDesc, String productShowImg, double productShowPrice, String productShowExtra, Integer productShopId) {
        this.productShowId = productShowId;
        this.productShowTitle = productShowTitle;
        this.productShowDesc = productShowDesc;
        this.productShowImg = productShowImg;
        this.productShowPrice = productShowPrice;
        this.productShowExtra = productShowExtra;
        this.productShopId = productShopId;
    }

    public Integer getProductShowId() {
        return productShowId;
    }

    public void setProductShowId(Integer productShowId) {
        this.productShowId = productShowId;
    }

    public String getProductShowTitle() {
        return productShowTitle;
    }

    public void setProductShowTitle(String productShowTitle) {
        this.productShowTitle = productShowTitle;
    }

    public String getProductShowDesc() {
        return productShowDesc;
    }

    public void setProductShowDesc(String productShowDesc) {
        this.productShowDesc = productShowDesc;
    }

    public String getProductShowImg() {
        return productShowImg;
    }

    public void setProductShowImg(String productShowImg) {
        this.productShowImg = productShowImg;
    }

    public double getProductShowPrice() {
        return productShowPrice;
    }

    public void setProductShowPrice(double productShowPrice) {
        this.productShowPrice = productShowPrice;
    }

    public String getProductShowExtra() {
        return productShowExtra;
    }

    public void setProductShowExtra(String productShowExtra) {
        this.productShowExtra = productShowExtra;
    }

    public Integer getProductShopId() {
        return productShopId;
    }

    public void setProductShopId(Integer productShopId) {
        this.productShopId = productShopId;
    }

    @Override
    public String toString() {
        return "ProductShow{" +
                "productShowId=" + productShowId +
                ", productShowTitle='" + productShowTitle + '\'' +
                ", productShowDesc='" + productShowDesc + '\'' +
                ", productShowImg='" + productShowImg + '\'' +
                ", productShowPrice='" + productShowPrice + '\'' +
                ", productShowExtra='" + productShowExtra + '\'' +
                ", productShopId=" + productShopId +
                '}';
    }
}
