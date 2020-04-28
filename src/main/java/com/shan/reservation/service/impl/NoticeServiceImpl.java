package com.shan.reservation.service.impl;

import com.shan.reservation.bean.notice;
import com.shan.reservation.mapper.noticeMapper;
import com.shan.reservation.mapper.noticeUtilMapper;
import com.shan.reservation.service.NoticeService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    noticeUtilMapper noticeUtilMapper;
    @Autowired
    noticeMapper noticeMapper;
    public notice selectNoticeByName(String noticeTitle){
        notice notice=noticeUtilMapper.selectNoticeByName(noticeTitle);
        return  notice;
    }

    @Override
    public List<notice> selectNoticeLast() {
        return noticeUtilMapper.selectNoticeLast();
    }

    @Override
    public notice selectById(int noticeId) {
        return noticeMapper.selectByPrimaryKey(noticeId);
    }

    @Override
    public int addNotice(notice notice) {
        return noticeMapper.insert(notice);
    }
}
