package com.shan.reservation.bean;

import java.util.Date;

public class couponUtil {

    private Double price;

    private Date startDate;

    private Date endDate;

    private String instructions;

    private String restaurantName;

    public couponUtil(Double price, Date startDate, Date endDate, String instructions, String restaurantName) {
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.instructions = instructions;
        this.restaurantName = restaurantName;
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
        this.instructions = instructions;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
