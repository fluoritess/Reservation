package com.shan.reservation.bean;

public class messageboard {
    private Integer messageboardId;

    private Integer userId;

    private Integer restaurantId;

    private String content;

    public messageboard(Integer userId, Integer restaurantId, String content) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.content = content;
    }

    public messageboard(Integer messageboardId, Integer userId, Integer restaurantId, String content) {
        this.messageboardId = messageboardId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.content = content;
    }

    public messageboard() {
        super();
    }

    public Integer getMessageboardId() {
        return messageboardId;
    }

    public void setMessageboardId(Integer messageboardId) {
        this.messageboardId = messageboardId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}