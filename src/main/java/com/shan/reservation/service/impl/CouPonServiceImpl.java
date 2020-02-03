package com.shan.reservation.service.impl;

import com.shan.reservation.bean.coupon;
import com.shan.reservation.bean.couponUtil;
import com.shan.reservation.bean.restaurant;
import com.shan.reservation.mapper.couponMapper;
import com.shan.reservation.mapper.couponMapperUtil;
import com.shan.reservation.mapper.restaurantMapper;
import com.shan.reservation.service.CouPonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class CouPonServiceImpl implements CouPonService {
    @Autowired
    couponMapper couponMapper;
    @Autowired
    couponMapperUtil couponMapperUtil;
    @Autowired
    restaurantMapper restaurantMapper;
    @Override
    public List<couponUtil> selectCouPonByUser(int userId) {
        List<coupon> list=couponMapperUtil.selectCouPonByUser(userId);
        List<couponUtil> tarlist=new ArrayList<>();
        Iterator it=list.iterator();
        while(it.hasNext()){
            coupon coupon=(com.shan.reservation.bean.coupon)it.next();
            Double price=coupon.getPrice();
            Date startDate=coupon.getStartDate();
            Date endDate=coupon.getEndDate();
            String instructions=coupon.getInstructions();
            int restaurantId=coupon.getRestaurantId();
            restaurant restaurant=restaurantMapper.selectByPrimaryKey(restaurantId);
            String restaurantName=restaurant.getRestaurantName();
            couponUtil couponUtil=new couponUtil(price,startDate,endDate,instructions,restaurantName);
            tarlist.add(couponUtil);
        }

        return tarlist;
    }
}
