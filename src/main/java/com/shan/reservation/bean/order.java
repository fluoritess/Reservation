package com.shan.reservation.bean;

import java.math.BigDecimal;
import java.util.Date;

public class order {
    private Integer orderid;

    private String orderno;

    private Integer userid;

    private Integer restaurantid;

    private BigDecimal price;

    private Byte ispay;

    private Byte isappraise;

    private Byte isrefund;

    private BigDecimal delivermoney;

    private Date createtime;

    private Date deliverytime;

    private Date receivetime;

    private Byte state;

    private String orderremarks;

    public order(Integer orderid, String orderno, Integer userid, Integer restaurantid, BigDecimal price, Byte ispay, Byte isappraise, Byte isrefund, BigDecimal delivermoney, Date createtime, Date deliverytime, Date receivetime, Byte state, String orderremarks) {
        this.orderid = orderid;
        this.orderno = orderno;
        this.userid = userid;
        this.restaurantid = restaurantid;
        this.price = price;
        this.ispay = ispay;
        this.isappraise = isappraise;
        this.isrefund = isrefund;
        this.delivermoney = delivermoney;
        this.createtime = createtime;
        this.deliverytime = deliverytime;
        this.receivetime = receivetime;
        this.state = state;
        this.orderremarks = orderremarks;
    }

    public order() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(Integer restaurantid) {
        this.restaurantid = restaurantid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getIspay() {
        return ispay;
    }

    public void setIspay(Byte ispay) {
        this.ispay = ispay;
    }

    public Byte getIsappraise() {
        return isappraise;
    }

    public void setIsappraise(Byte isappraise) {
        this.isappraise = isappraise;
    }

    public Byte getIsrefund() {
        return isrefund;
    }

    public void setIsrefund(Byte isrefund) {
        this.isrefund = isrefund;
    }

    public BigDecimal getDelivermoney() {
        return delivermoney;
    }

    public void setDelivermoney(BigDecimal delivermoney) {
        this.delivermoney = delivermoney;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks == null ? null : orderremarks.trim();
    }
}