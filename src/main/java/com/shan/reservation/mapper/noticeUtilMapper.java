package com.shan.reservation.mapper;

import com.shan.reservation.bean.notice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface noticeUtilMapper {
        notice selectNoticeByName(String noticeTitle);
}
