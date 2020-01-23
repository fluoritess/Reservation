package com.shan.reservation.bean;

import java.util.Date;

public class evaluation {
    private Integer evaluationId;

    private String orderId;

    private String evaluationContent;

    private Date evaluationStart;

    private Date evaluationData;

    private Integer userId;

    private Integer restaurantId;

    public evaluation(Integer evaluationId, String orderId, String evaluationContent, Date evaluationStart, Date evaluationData, Integer userId, Integer restaurantId) {
        this.evaluationId = evaluationId;
        this.orderId = orderId;
        this.evaluationContent = evaluationContent;
        this.evaluationStart = evaluationStart;
        this.evaluationData = evaluationData;
        this.userId = userId;
        this.restaurantId = restaurantId;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    public Date getEvaluationStart() {
        return evaluationStart;
    }

    public void setEvaluationStart(Date evaluationStart) {
        this.evaluationStart = evaluationStart;
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
}