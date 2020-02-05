package com.shan.reservation.service;

import com.shan.reservation.bean.collect;
import com.shan.reservation.bean.collectUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CollectService {
    List<collectUtil> selectByUser(int user_id);
    List<collect> selectByUserAndRe(int user_id,int reId);
    void deleteCollect(int user_id,int reId);
    void insert(int userId,int restaurantId);
}
