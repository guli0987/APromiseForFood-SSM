package com.hkd.domain;

import java.sql.Timestamp;

public class ProductInfo {
    private Integer productId;
    private String productName;
    private Timestamp productAddDate;
    private String productGoodsBannerImgs;
    private String productGoodsDesc;
    private double productGoodsPrice;
    private String productGoodsSn;
    private String productGoodsThumb;
    private String productGoodsType;
    private Integer productAloneSale;
    private Integer productBest;
    private Integer productHot;
    private Integer productNew;
    private Integer productOnSale;
    private Integer productReal;
    private String productKeywords;
    private Timestamp productLastModifyDate;
    private String productSellerNote;
    private String productTag;
    private Integer productShowId;

    public ProductInfo(Integer productId, String productName, Timestamp productAddDate, String productGoodsBannerImgs, String productGoodsDesc, double productGoodsPrice, String productGoodsSn, String productGoodsThumb, String productGoodsType, Integer productAloneSale, Integer productBest, Integer productHot, Integer productNew, Integer productOnSale, Integer productReal, String productKeywords, Timestamp productLastModifyDate, String productSellerNote, String productTag, Integer productShowId) {
        this.productId = productId;
        this.productName = productName;
        this.productAddDate = productAddDate;
        this.productGoodsBannerImgs = productGoodsBannerImgs;
        this.productGoodsDesc = productGoodsDesc;
        this.productGoodsPrice = productGoodsPrice;
        this.productGoodsSn = productGoodsSn;
        this.productGoodsThumb = productGoodsThumb;
        this.productGoodsType = productGoodsType;
        this.productAloneSale = productAloneSale;
        this.productBest = productBest;
        this.productHot = productHot;
        this.productNew = productNew;
        this.productOnSale = productOnSale;
        this.productReal = productReal;
        this.productKeywords = productKeywords;
        this.productLastModifyDate = productLastModifyDate;
        this.productSellerNote = productSellerNote;
        this.productTag = productTag;
        this.productShowId = productShowId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Timestamp getProductAddDate() {
        return productAddDate;
    }

    public void setProductAddDate(Timestamp productAddDate) {
        this.productAddDate = productAddDate;
    }

    public String getProductGoodsBannerImgs() {
        return productGoodsBannerImgs;
    }

    public void setProductGoodsBannerImgs(String productGoodsBannerImgs) {
        this.productGoodsBannerImgs = productGoodsBannerImgs;
    }

    public String getProductGoodsDesc() {
        return productGoodsDesc;
    }

    public void setProductGoodsDesc(String productGoodsDesc) {
        this.productGoodsDesc = productGoodsDesc;
    }

    public double getProductGoodsPrice() {
        return productGoodsPrice;
    }

    public void setProductGoodsPrice(double productGoodsPrice) {
        this.productGoodsPrice = productGoodsPrice;
    }

    public String getProductGoodsSn() {
        return productGoodsSn;
    }

    public void setProductGoodsSn(String productGoodsSn) {
        this.productGoodsSn = productGoodsSn;
    }

    public String getProductGoodsThumb() {
        return productGoodsThumb;
    }

    public void setProductGoodsThumb(String productGoodsThumb) {
        this.productGoodsThumb = productGoodsThumb;
    }

    public String getProductGoodsType() {
        return productGoodsType;
    }

    public void setProductGoodsType(String productGoodsType) {
        this.productGoodsType = productGoodsType;
    }

    public Integer getProductAloneSale() {
        return productAloneSale;
    }

    public void setProductAloneSale(Integer productAloneSale) {
        this.productAloneSale = productAloneSale;
    }

    public Integer getProductBest() {
        return productBest;
    }

    public void setProductBest(Integer productBest) {
        this.productBest = productBest;
    }

    public Integer getProductHot() {
        return productHot;
    }

    public void setProductHot(Integer productHot) {
        this.productHot = productHot;
    }

    public Integer getProductNew() {
        return productNew;
    }

    public void setProductNew(Integer productNew) {
        this.productNew = productNew;
    }

    public Integer getProductOnSale() {
        return productOnSale;
    }

    public void setProductOnSale(Integer productOnSale) {
        this.productOnSale = productOnSale;
    }

    public Integer getProductReal() {
        return productReal;
    }

    public void setProductReal(Integer productReal) {
        this.productReal = productReal;
    }

    public String getProductKeywords() {
        return productKeywords;
    }

    public void setProductKeywords(String productKeywords) {
        this.productKeywords = productKeywords;
    }

    public Timestamp getProductLastModifyDate() {
        return productLastModifyDate;
    }

    public void setProductLastModifyDate(Timestamp productLastModifyDate) {
        this.productLastModifyDate = productLastModifyDate;
    }

    public String getProductSellerNote() {
        return productSellerNote;
    }

    public void setProductSellerNote(String productSellerNote) {
        this.productSellerNote = productSellerNote;
    }

    public String getProductTag() {
        return productTag;
    }

    public void setProductTag(String productTag) {
        this.productTag = productTag;
    }

    public Integer getProductShowId() {
        return productShowId;
    }

    public void setProductShowId(Integer productShowId) {
        this.productShowId = productShowId;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productAddDate=" + productAddDate +
                ", productGoodsBannerImgs='" + productGoodsBannerImgs + '\'' +
                ", productGoodsDesc='" + productGoodsDesc + '\'' +
                ", productGoodsPrice=" + productGoodsPrice +
                ", productGoodsSn='" + productGoodsSn + '\'' +
                ", productGoodsThumb='" + productGoodsThumb + '\'' +
                ", productGoodsType='" + productGoodsType + '\'' +
                ", productAloneSale=" + productAloneSale +
                ", productBest=" + productBest +
                ", productHot=" + productHot +
                ", productNew=" + productNew +
                ", productOnSale=" + productOnSale +
                ", productReal=" + productReal +
                ", productKeywords='" + productKeywords + '\'' +
                ", productLastModifyDate=" + productLastModifyDate +
                ", productSellerNote='" + productSellerNote + '\'' +
                ", productTag='" + productTag + '\'' +
                ", productShowId=" + productShowId +
                '}';
    }
}
