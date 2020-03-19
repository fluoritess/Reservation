package com.shan.reservation.service.impl;

import com.shan.reservation.bean.messageboard;
import com.shan.reservation.mapper.messageboardUtilMapper;
import com.shan.reservation.service.messageboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class messageboardServiceImpl implements messageboardService {
    @Autowired
    messageboardUtilMapper messageboardUtilMapper;
    @Override
    public List<messageboard> selectMessageByRe(int restaurantId) {
        List<messageboard> list=  messageboardUtilMapper.selectMessageByRe(restaurantId);
        return list;
    }

    @Override
    public int insert(int userId, int restaurantId, String content) {

        messageboardUtilMapper.insert(userId,restaurantId,content);
        return 1;
    }
}
