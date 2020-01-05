package com.shan.reservation.bean;

import java.util.Date;

public class admin {
    private Integer adminId;

    private String adminPassword;

    private Date systemTime;

    private String adminName;

    public admin(Integer adminId, String adminPassword, Date systemTime, String adminName) {
        this.adminId = adminId;
        this.adminPassword = adminPassword;
        this.systemTime = systemTime;
        this.adminName = adminName;
    }

    public admin() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Date getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(Date systemTime) {
        this.systemTime = systemTime;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }
}