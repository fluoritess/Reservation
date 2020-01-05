package com.shan.reservation.bean;

public class address {
    private Integer addressId;

    private String addressProvence;

    private String addressCity;

    private String addressDistrict;

    private String addressStreet;

    public address(Integer addressId, String addressProvence, String addressCity, String addressDistrict, String addressStreet) {
        this.addressId = addressId;
        this.addressProvence = addressProvence;
        this.addressCity = addressCity;
        this.addressDistrict = addressDistrict;
        this.addressStreet = addressStreet;
    }

    public address() {
        super();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressProvence() {
        return addressProvence;
    }

    public void setAddressProvence(String addressProvence) {
        this.addressProvence = addressProvence == null ? null : addressProvence.trim();
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity == null ? null : addressCity.trim();
    }

    public String getAddressDistrict() {
        return addressDistrict;
    }

    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict == null ? null : addressDistrict.trim();
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet == null ? null : addressStreet.trim();
    }
}