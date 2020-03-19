package com.shan.reservation.service;

import com.shan.reservation.bean.messageboard;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsw
 * @Package com.shan.reservation.service
 * @Description:
 * @date 2020年3月18日 22:01:08
 */
@Service
public interface messageboardService {
    List<messageboard> selectMessageByRe(int restaurantId);
    int insert(int userId,int restaurantId,String content);
}
