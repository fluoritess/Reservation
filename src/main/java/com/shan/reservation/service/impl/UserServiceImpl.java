package com.shan.reservation.service.impl;

import com.shan.reservation.bean.evaluation;
import com.shan.reservation.bean.order;
import com.shan.reservation.bean.user;
import com.shan.reservation.mapper.*;
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
    evaluationMapper evaluationMapper;
    @Autowired
    com.shan.reservation.service.OrderService OrderService;
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
    public void updateByName(String userName, Date lastDate, Date thisDate) {
        userMapperUtil.updateByName(userName,lastDate,thisDate);
    }


    @Override
    public List<user> selectAllUser() {
        return userMapper.selectByExample(null);
    }

    @Override
    public void UserEvaluation(String no, double score,String content) {
        order order=OrderService.selectOrder(no);
        int oreder_id=order.getOrderid();
        int re_id=order.getRestaurantid();
        int user_id=order.getUserid();
        Date date=new Date();
        evaluation evaluation=new evaluation(oreder_id,content,date,user_id,re_id,score);
        evaluationMapper.insert(evaluation);
    }

    @Override
    public user selectLastDate(String userName) {
        return userMapperUtil.selectLastDate(userName);
    }

    @Override
    public int register(user user) {
        return  userMapperUtil.insert(user);
    }


}
