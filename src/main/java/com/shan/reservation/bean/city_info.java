package com.shan.reservation.bean;

public class city_info {
    private String cityName;

    private String cityDistict;

    public city_info(String cityName, String cityDistict) {
        this.cityName = cityName;
        this.cityDistict = cityDistict;
    }

    public city_info() {
        super();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityDistict() {
        return cityDistict;
    }

    public void setCityDistict(String cityDistict) {
        this.cityDistict = cityDistict == null ? null : cityDistict.trim();
    }
}