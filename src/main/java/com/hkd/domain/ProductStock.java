package com.hkd.domain;

public class ProductStock {
    private Integer productStockId;
    private Integer productStockCount;
    private Integer productMonthSellCount;
    private Integer productTotalSellCount;
    private Integer productShowId;

    public ProductStock(Integer productStockId, Integer productStockCount, Integer productMonthSellCount, Integer productTotalSellCount, Integer productShowId) {
        this.productStockId = productStockId;
        this.productStockCount = productStockCount;
        this.productMonthSellCount = productMonthSellCount;
        this.productTotalSellCount = productTotalSellCount;
        this.productShowId = productShowId;
    }

    public Integer getProductStockId() {
        return productStockId;
    }

    public void setProductStockId(Integer productStockId) {
        this.productStockId = productStockId;
    }

    public Integer getProductStockCount() {
        return productStockCount;
    }

    public void setProductStockCount(Integer productStockCount) {
        this.productStockCount = productStockCount;
    }

    public Integer getProductMonthSellCount() {
        return productMonthSellCount;
    }

    public void setProductMonthSellCount(Integer productMonthSellCount) {
        this.productMonthSellCount = productMonthSellCount;
    }

    public Integer getProductTotalSellCount() {
        return productTotalSellCount;
    }

    public void setProductTotalSellCount(Integer productTotalSellCount) {
        this.productTotalSellCount = productTotalSellCount;
    }

    public Integer getProductShowId() {
        return productShowId;
    }

    public void setProductShowId(Integer productShowId) {
        this.productShowId = productShowId;
    }

    @Override
    public String toString() {
        return "ProductStock{" +
                "productStockId=" + productStockId +
                ", productStockCount=" + productStockCount +
                ", productMonthSellCount=" + productMonthSellCount +
                ", productTotalSellCount=" + productTotalSellCount +
                ", productShowId=" + productShowId +
                '}';
    }
}
