package com.shan.reservation.bean;

public class restaurantUtil {
    private Integer restaurantId;

    private String restaurantPassword;

    private String restaurantAddress;

    private String restaurantPhone;

    private String restaurantName;

    private Integer restaurantState;

    private String restaurantCategory;

    private Double score;

    private String restaurantImage;

    public restaurantUtil() {
    }

    public restaurantUtil(Integer restaurantId, String restaurantPassword, String restaurantAddress, String restaurantPhone, String restaurantName, Integer restaurantState, String restaurantCategory, Double score) {
        this.restaurantId = restaurantId;
        this.restaurantPassword = restaurantPassword;
        this.restaurantAddress = restaurantAddress;
        this.restaurantPhone = restaurantPhone;
        this.restaurantName = restaurantName;
        this.restaurantState = restaurantState;
        this.restaurantCategory = restaurantCategory;
        this.score = score;
    }

    public restaurantUtil(Integer restaurantId, String restaurantPassword, String restaurantAddress, String restaurantPhone, String restaurantName, Integer restaurantState, String restaurantCategory, Double score, String restaurantImage) {
        this.restaurantId = restaurantId;
        this.restaurantPassword = restaurantPassword;
        this.restaurantAddress = restaurantAddress;
        this.restaurantPhone = restaurantPhone;
        this.restaurantName = restaurantName;
        this.restaurantState = restaurantState;
        this.restaurantCategory = restaurantCategory;
        this.score = score;
        this.restaurantImage = restaurantImage;
    }

    public String getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(String restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantPassword() {
        return restaurantPassword;
    }

    public void setRestaurantPassword(String restaurantPassword) {
        this.restaurantPassword = restaurantPassword;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantPhone() {
        return restaurantPhone;
    }

    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getRestaurantState() {
        return restaurantState;
    }

    public void setRestaurantState(Integer restaurantState) {
        this.restaurantState = restaurantState;
    }

    public String getRestaurantCategory() {
        return restaurantCategory;
    }

    public void setRestaurantCategory(String restaurantCategory) {
        this.restaurantCategory = restaurantCategory;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
