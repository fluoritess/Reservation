package com.shan.reservation.bean;

public class food {
    private Integer foodId;

    private Integer restaurantId;

    private Double foodPrice;

    private String foodName;

    private Integer categoryId;

    private String describe;

    private Integer sales;

    public food(Integer foodId, Integer restaurantId, Double foodPrice, String foodName, Integer categoryId, String describe, Integer sales) {
        this.foodId = foodId;
        this.restaurantId = restaurantId;
        this.foodPrice = foodPrice;
        this.foodName = foodName;
        this.categoryId = categoryId;
        this.describe = describe;
        this.sales = sales;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
}