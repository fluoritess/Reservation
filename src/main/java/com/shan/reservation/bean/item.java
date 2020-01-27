package com.shan.reservation.bean;

public class item {
    private Integer itemId;

    private Integer userId;

    private Integer foodId;

    private Integer number;

    public item(Integer userId, Integer foodId, Integer number) {
        this.userId = userId;
        this.foodId = foodId;
        this.number = number;
    }

    public item(Integer itemId, Integer userId, Integer foodId, Integer number) {
        this.itemId = itemId;
        this.userId = userId;
        this.foodId = foodId;
        this.number = number;
    }

    public item() {
        super();
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}