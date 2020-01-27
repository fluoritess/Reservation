package com.shan.reservation.bean;

public class cartutil {
    private String foodName;
    private String foodImage;
    private Double foodPrice;
    private String restaurantName;
    private Double foodBargain;
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Double getFoodBargain() {
        return foodBargain;
    }

    public void setFoodBargain(Double foodBargain) {
        this.foodBargain = foodBargain;
    }

    public cartutil(String foodName, String foodImage, Double foodPrice, String restaurantName, Double foodBargain) {
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.foodPrice = foodPrice;
        this.restaurantName = restaurantName;
        this.foodBargain = foodBargain;
    }

    public cartutil(String foodName, String foodImage, Double foodPrice, String restaurantName) {
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.foodPrice = foodPrice;
        this.restaurantName = restaurantName;
    }
}
