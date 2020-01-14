package com.shan.reservation.bean;

public class food {
    private Integer foodId;

    private Integer restaurantId;

    private Double foodPrice;

    private String foodName;

    private Integer categoryId;

    private String foodDescribe;

    private Integer sales;

    private String foodImage;

    public food(Integer foodId, Integer restaurantId, Double foodPrice, String foodName, Integer categoryId, String foodDescribe, Integer sales, String foodImage) {
        this.foodId = foodId;
        this.restaurantId = restaurantId;
        this.foodPrice = foodPrice;
        this.foodName = foodName;
        this.categoryId = categoryId;
        this.foodDescribe = foodDescribe;
        this.sales = sales;
        this.foodImage = foodImage;
    }

    public food() {
        super();
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getFoodDescribe() {
        return foodDescribe;
    }

    public void setFoodDescribe(String foodDescribe) {
        this.foodDescribe = foodDescribe == null ? null : foodDescribe.trim();
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage == null ? null : foodImage.trim();
    }
}