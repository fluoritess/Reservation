package com.shan.reservation.bean;

import java.util.Date;

public class coupon {
    private Integer couponId;

    private Integer userId;

    private Integer restaurantId;

    private Double price;

    private Date startDate;

    private Date endDate;

    private String instructions;

    public coupon(Integer couponId, Integer userId, Integer restaurantId, Double price, Date startDate, Date endDate, String instructions) {
        this.couponId = couponId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.instructions = instructions;
    }

    public coupon() {
        super();
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions == null ? null : instructions.trim();
    }
}