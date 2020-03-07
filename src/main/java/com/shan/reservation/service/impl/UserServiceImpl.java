package com.shan.reservation.service.impl;

import com.shan.reservation.bean.order;
import com.shan.reservation.bean.restaurant_score;
import com.shan.reservation.bean.user;
import com.shan.reservation.mapper.orderMapper;
import com.shan.reservation.mapper.restaurant_scoreMapper;
import com.shan.reservation.mapper.userMapper;
import com.shan.reservation.mapper.userMapperUtil;
import com.shan.reservation.service.OrderService;
import com.shan.reservation.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
/**
 * @author wsw
 * @Package com.gabe.mychat.service
 * @Description:
 * @date 2020年1月5日 22:17:26
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    userMapper userMapper;
    @Autowired
    userMapperUtil  userMapperUtil;
    @Autowired
    orderMapper orderMapper;
    @Autowired
    com.shan.reservation.service.OrderService OrderService;
    @Autowired
    restaurant_scoreMapper restaurant_scoreMapper;
    @Override
    public user selectUserByNickName(String nickname) {
        List<user> list=userMapper.selectByExample(null);
        Iterator it=list.iterator();
        while(it.hasNext()){
            user user=(user)it.next();
            if(user.getUserName().equals(nickname)){
                return user;
            }
        }
        return null;
    }

    @Override
    public user selectUserById(int userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public void updateByName(String name, Date date) {
        userMapperUtil.updateByName(name,date);
    }

    @Override
    public List<user> selectAllUser() {
        return userMapper.selectByExample(null);
    }

    @Override
    public void UserEvaluation(String no, double score) {
        order order=OrderService.selectOrder(no);
        int re_id=order.getRestaurantid();
        int user_id=order.getUserid();
        restaurant_score restaurant_score=new restaurant_score(re_id,user_id,score);
        restaurant_scoreMapper.insert(restaurant_score);
    }


}
