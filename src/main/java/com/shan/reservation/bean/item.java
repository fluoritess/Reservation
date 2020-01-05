package com.shan.reservation.bean;

public class item {
    private Integer itemId;

    private Integer foodId;

    private Integer number;

    public item(Integer itemId, Integer foodId, Integer number) {
        this.itemId = itemId;
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