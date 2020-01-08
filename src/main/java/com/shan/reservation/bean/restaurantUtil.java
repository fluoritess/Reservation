package com.shan.reservation.bean;

public class restaurantUtil {
    private Integer restaurantId;

    private String restaurantPassword;

    private String restaurantAddress;

    private String restaurantPhone;

    private String restaurantName;

    private Integer restaurantState;

    private String restaurantCategory;

    public restaurantUtil() {
    }

    public restaurantUtil(Integer restaurantId, String restaurantPassword, String restaurantAddress, String restaurantPhone, String restaurantName, Integer restaurantState, String restaurantCategory) {
        this.restaurantId = restaurantId;
        this.restaurantPassword = restaurantPassword;
        this.restaurantAddress = restaurantAddress;
        this.restaurantPhone = restaurantPhone;
        this.restaurantName = restaurantName;
        this.restaurantState = restaurantState;
        this.restaurantCategory = restaurantCategory;
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
}
