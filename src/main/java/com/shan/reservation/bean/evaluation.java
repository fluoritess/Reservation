package com.shan.reservation.bean;

import java.util.Date;

public class evaluation {
    private Integer evaluationId;

    private Integer orderId;

    private String evaluationContent;

    private Date evaluationData;

    private Integer userId;

    private Integer restaurantId;

    private Double score;

    public evaluation(Integer evaluationId, Integer orderId, String evaluationContent, Date evaluationData, Integer userId, Integer restaurantId, Double score) {
        this.evaluationId = evaluationId;
        this.orderId = orderId;
        this.evaluationContent = evaluationContent;
        this.evaluationData = evaluationData;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.score = score;
    }

    public evaluation(Integer orderId, String evaluationContent, Date evaluationData, Integer userId, Integer restaurantId, Double score) {
        this.orderId = orderId;
        this.evaluationContent = evaluationContent;
        this.evaluationData = evaluationData;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.score = score;
    }

    public evaluation() {
        super();
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    public Date getEvaluationData() {
        return evaluationData;
    }

    public void setEvaluationData(Date evaluationData) {
        this.evaluationData = evaluationData;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}