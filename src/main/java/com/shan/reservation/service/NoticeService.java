package com.shan.reservation.service;

import com.shan.reservation.bean.notice;
import org.springframework.stereotype.Service;

/**
 * @author wsw
 * @Package com.gabe.mychat.service
 * @Description:
 * @date 2020年2月8日 14:52:09
 */
@Service
public interface NoticeService {
    notice selectNoticeByName(String noticeTitle);
}
