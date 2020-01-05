package com.shan.reservation.bean;

import java.util.Date;

public class order {
    private String orderId;

    private Integer orderUser;

    private Integer orderRestaurant;

    private Integer orderPrice;

    private Date createTime;

    private Date updateTime;

    private String orderFood;

    private Integer orderState;

    private Integer isShip;

    public order(String orderId, Integer orderUser, Integer orderRestaurant, Integer orderPrice, Date createTime, Date updateTime, String orderFood, Integer orderState, Integer isShip) {
        this.orderId = orderId;
        this.orderUser = orderUser;
        this.orderRestaurant = orderRestaurant;
        this.orderPrice = orderPrice;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.orderFood = orderFood;
        this.orderState = orderState;
        this.isShip = isShip;
    }

    public order() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(Integer orderUser) {
        this.orderUser = orderUser;
    }

    public Integer getOrderRestaurant() {
        return orderRestaurant;
    }

    public void setOrderRestaurant(Integer orderRestaurant) {
        this.orderRestaurant = orderRestaurant;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOrderFood() {
        return orderFood;
    }

    public void setOrderFood(String orderFood) {
        this.orderFood = orderFood == null ? null : orderFood.trim();
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getIsShip() {
        return isShip;
    }

    public void setIsShip(Integer isShip) {
        this.isShip = isShip;
    }
}