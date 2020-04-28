package com.shan.reservation.service;

import com.shan.reservation.bean.notice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsw
 * @Package com.shan.reservation.service
 * @Description:
 * @date 2020年2月8日 14:52:09
 */
@Service
public interface NoticeService {
    notice selectNoticeByName(String noticeTitle);
    List<notice> selectNoticeLast();
    notice selectById(int noticeId);
}
