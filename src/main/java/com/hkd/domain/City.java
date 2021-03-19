package com.hkd.domain;

import java.io.Serializable;

/**
 * 城市实体类
 */
public class City implements Serializable {
    /**
     * 城市序号
     */
    private int cityId;
    /**
     * 城市名
     */
    private String cityName;
    /**
     * 城市行政区划代码
     */
    private String cityCode;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", cityCode='" + cityCode + '\'' +
                '}';
    }
}
