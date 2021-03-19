package com.hkd.domain;

public class AreaType {
    /**
     * 地区类型id
     */
    private Integer areaTypeId;
    /**
     * 地区类型名称
     */
    private String areaTypeName;
    /**
     * 地区类型额外信息
     */
    private String areaTypeExtra;

    public Integer getAreaTypeId() {
        return areaTypeId;
    }

    public void setAreaTypeId(Integer areaTypeId) {
        this.areaTypeId = areaTypeId;
    }

    public String getAreaTypeName() {
        return areaTypeName;
    }

    public void setAreaTypeName(String areaTypeName) {
        this.areaTypeName = areaTypeName;
    }

    public String getAreaTypeExtra() {
        return areaTypeExtra;
    }

    public void setAreaTypeExtra(String areaTypeExtra) {
        this.areaTypeExtra = areaTypeExtra;
    }

    @Override
    public String toString() {
        return "AreaType{" +
                "areaTypeId=" + areaTypeId +
                ", areaTypeName='" + areaTypeName + '\'' +
                ", areaTypeExtra='" + areaTypeExtra + '\'' +
                '}';
    }
}
