package com.shan.reservation.service.impl;

import com.shan.reservation.bean.collect;
import com.shan.reservation.bean.collectUtil;
import com.shan.reservation.bean.restaurant;
import com.shan.reservation.mapper.collectUtilMapper;
import com.shan.reservation.mapper.restaurantMapper;
import com.shan.reservation.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    collectUtilMapper collectUtilMapper;
    @Autowired
    restaurantMapper restaurantMapper;
    @Override
    public List<collectUtil> selectByUser(int user_id) {
        List<collect> list=collectUtilMapper.selectByUser(user_id);
        List<collectUtil> tar=new ArrayList<>();
        Iterator it=list.iterator();
        while(it.hasNext()){
            collect collect=(collect)it.next();
            int reId=collect.getRestaurantId();
            restaurant restaurant=restaurantMapper.selectByPrimaryKey(reId);
            String reName=restaurant.getRestaurantName();
            String image=restaurant.getRestaurantImage();
            collectUtil collectUtil=new collectUtil(reId,reName,image);
            tar.add(collectUtil);
        }
        return tar;
    }

    @Override
    public List<collect> selectByUserAndRe(int user_id, int restaurantId) {
        List<collect> list=collectUtilMapper.selectByUserAndRe(user_id,restaurantId);
        return list;
    }
}
