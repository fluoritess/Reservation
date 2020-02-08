package com.shan.reservation.service.impl;

import com.shan.reservation.bean.notice;
import com.shan.reservation.mapper.noticeUtilMapper;
import com.shan.reservation.service.NoticeService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    noticeUtilMapper noticeUtilMapper;
    public notice selectNoticeByName(String noticeTitle){
        notice notice=noticeUtilMapper.selectNoticeByName(noticeTitle);
        return  notice;
    }
}
