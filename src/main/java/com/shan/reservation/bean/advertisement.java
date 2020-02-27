package com.shan.reservation.bean;

import java.math.BigDecimal;
import java.util.Date;

public class advertisement {
    private Integer advertisementId;

    private String advertisementTitle;

    private String advertisementImag;

    private String advertisementContent;

    private Integer restaurantId;

    private Integer advertisementState;

    private Date adstartdate;

    private Date adenddate;

    private BigDecimal advertisementPrice;

    public advertisement(Integer advertisementId, String advertisementTitle, String advertisementImag, String advertisementContent, Integer restaurantId, Integer advertisementState, Date adstartdate, Date adenddate, BigDecimal advertisementPrice) {
        this.advertisementId = advertisementId;
        this.advertisementTitle = advertisementTitle;
        this.advertisementImag = advertisementImag;
        this.advertisementContent = advertisementContent;
        this.restaurantId = restaurantId;
        this.advertisementState = advertisementState;
        this.adstartdate = adstartdate;
        this.adenddate = adenddate;
        this.advertisementPrice = advertisementPrice;
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

    public Date getAdstartdate() {
        return adstartdate;
    }

    public void setAdstartdate(Date adstartdate) {
        this.adstartdate = adstartdate;
    }

    public Date getAdenddate() {
        return adenddate;
    }

    public void setAdenddate(Date adenddate) {
        this.adenddate = adenddate;
    }

    public BigDecimal getAdvertisementPrice() {
        return advertisementPrice;
    }

    public void setAdvertisementPrice(BigDecimal advertisementPrice) {
        this.advertisementPrice = advertisementPrice;
    }
}