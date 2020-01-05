package com.shan.reservation.bean;

import java.util.Date;

public class evaluation {
    private Integer evaluationId;

    private String orderId;

    private String evaluationContent;

    private Integer evaluationStart;

    private Date evaluationData;

    public evaluation(Integer evaluationId, String orderId, String evaluationContent, Integer evaluationStart, Date evaluationData) {
        this.evaluationId = evaluationId;
        this.orderId = orderId;
        this.evaluationContent = evaluationContent;
        this.evaluationStart = evaluationStart;
        this.evaluationData = evaluationData;
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

    public Integer getEvaluationStart() {
        return evaluationStart;
    }

    public void setEvaluationStart(Integer evaluationStart) {
        this.evaluationStart = evaluationStart;
    }

    public Date getEvaluationData() {
        return evaluationData;
    }

    public void setEvaluationData(Date evaluationData) {
        this.evaluationData = evaluationData;
    }
}