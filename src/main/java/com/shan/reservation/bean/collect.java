package com.shan.reservation.bean;

public class collect {
    private Integer collecteId;

    private Integer userId;

    private Integer restaurantId;

    private Integer foodId;

    public collect(Integer collecteId, Integer userId, Integer restaurantId, Integer foodId) {
        this.collecteId = collecteId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.foodId = foodId;
    }

    public collect() {
        super();
    }

    public Integer getCollecteId() {
        return collecteId;
    }

    public void setCollecteId(Integer collecteId) {
        this.collecteId = collecteId;
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

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
}