package com.shan.reservation.bean;

public class advertisement {
    private Integer advertisementId;

    private String advertisementTitle;

    private String advertisementImag;

    private String advertisementContent;

    private Integer restaurantId;

    private Integer advertisementState;

    public advertisement(Integer advertisementId, String advertisementTitle, String advertisementImag, String advertisementContent, Integer restaurantId, Integer advertisementState) {
        this.advertisementId = advertisementId;
        this.advertisementTitle = advertisementTitle;
        this.advertisementImag = advertisementImag;
        this.advertisementContent = advertisementContent;
        this.restaurantId = restaurantId;
        this.advertisementState = advertisementState;
    }

    public advertisement() {
        super();
    }

    public Integer getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(Integer advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getAdvertisementTitle() {
        return advertisementTitle;
    }

    public void setAdvertisementTitle(String advertisementTitle) {
        this.advertisementTitle = advertisementTitle == null ? null : advertisementTitle.trim();
    }

    public String getAdvertisementImag() {
        return advertisementImag;
    }

    public void setAdvertisementImag(String advertisementImag) {
        this.advertisementImag = advertisementImag == null ? null : advertisementImag.trim();
    }

    public String getAdvertisementContent() {
        return advertisementContent;
    }

    public void setAdvertisementContent(String advertisementContent) {
        this.advertisementContent = advertisementContent == null ? null : advertisementContent.trim();
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getAdvertisementState() {
        return advertisementState;
    }

    public void setAdvertisementState(Integer advertisementState) {
        this.advertisementState = advertisementState;
    }
}