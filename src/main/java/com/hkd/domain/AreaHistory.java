package com.hkd.domain;

public class AreaHistory {
    /**
     * 区域id
     */
    private Integer areaId;
    /**
     * 区域名称
     */
    private String areaName;
    /**
     * 区域码
     */
    private Integer areaCode;
    /**
     * 区域类型码
     */
    private Integer areaTypeId;
    /**
     * 区域所属城市id
     */
    private Integer cityId;

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

    public Integer getAreaTypeId() {
        return areaTypeId;
    }

    public void setAreaTypeId(Integer areaTypeId) {
        this.areaTypeId = areaTypeId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", areaCode=" + areaCode +
                ", areaTypeId=" + areaTypeId +
                ", cityId=" + cityId +
                '}';
    }
}
