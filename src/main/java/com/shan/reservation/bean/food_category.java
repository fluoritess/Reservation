package com.shan.reservation.bean;

public class food_category {
    private Integer foodCategoryId;

    private String categoryName;

    public food_category(Integer foodCategoryId, String categoryName) {
        this.foodCategoryId = foodCategoryId;
        this.categoryName = categoryName;
    }

    public food_category() {
        super();
    }

    public Integer getFoodCategoryId() {
        return foodCategoryId;
    }

    public void setFoodCategoryId(Integer foodCategoryId) {
        this.foodCategoryId = foodCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }
}