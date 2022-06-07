package com.devomar.acuiferos.domain.dto;

public class Aquifer {

    private Long aquiferId;
    private String description;
    private String waterBodyType;
    private String typeWater;
    private String geoDistribution;

    public Long getAquiferId() {
        return aquiferId;
    }

    public void setAquiferId(Long aquiferId) {
        this.aquiferId = aquiferId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWaterBodyType() {
        return waterBodyType;
    }

    public void setWaterBodyType(String waterBodyType) {
        this.waterBodyType = waterBodyType;
    }

    public String getTypeWater() {
        return typeWater;
    }

    public void setTypeWater(String typeWater) {
        this.typeWater = typeWater;
    }

    public String getGeoDistribution() {
        return geoDistribution;
    }

    public void setGeoDistribution(String geoDistribution) {
        this.geoDistribution = geoDistribution;
    }
}
