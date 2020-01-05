package com.shan.reservation.bean;

import java.util.Date;

public class notice {
    private Integer noticeId;

    private Integer adminId;

    private String noticeTitle;

    private String noticeContent;

    private Date noticeData;

    public notice(Integer noticeId, Integer adminId, String noticeTitle, String noticeContent, Date noticeData) {
        this.noticeId = noticeId;
        this.adminId = adminId;
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
        this.noticeData = noticeData;
    }

    public notice() {
        super();
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    public Date getNoticeData() {
        return noticeData;
    }

    public void setNoticeData(Date noticeData) {
        this.noticeData = noticeData;
    }
}