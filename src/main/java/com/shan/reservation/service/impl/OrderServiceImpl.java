package com.shan.reservation.service.impl;

import com.shan.reservation.bean.order;
import com.shan.reservation.mapper.orderMapper;
import com.shan.reservation.mapper.orderUtilMapper;
import com.shan.reservation.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    orderUtilMapper orderUtilMapper;
    @Autowired
   orderMapper orderMapper;
    @Override
    public List<order> selectByUserId(int userId) {
        List<order> list=orderUtilMapper.selectByUserId(userId);
        return list;
    }

    @Override
    public void deleteByNo(String orderNo) {
        orderUtilMapper.deleteByNo(orderNo);
    }

    @Override
    public void deleteByNo2(String orderNo) {
        orderUtilMapper.updateByNo(orderNo);
    }

    @Override
    public void uodateByNo1(String orderNo) {
        orderUtilMapper.updateByNo2(orderNo);
    }

    @Override
    public void addOrder(order order) {
        orderUtilMapper.insert(order);
    }

    @Override
    public order selectOrder(String orderNo) {
        return orderUtilMapper.selectOrder(orderNo);
    }

    @Override
    public List<order> ResSelectOrder(int restaurantid) {
        return orderUtilMapper.ResSelectOrder(restaurantid);
    }

    @Override
    public List<order> OrderLimitOneDay(int restaurantid) {
        return orderUtilMapper.OrderLimitOneDay(restaurantid);
    }

    @Override
    public List<order> OrderLimitOneWeek(int restaurantid) {
        return orderUtilMapper.OrderLimitOneWeek(restaurantid);
    }

    @Override
    public List<order> OrderState1(int restaurantid) {
        return orderUtilMapper.OrderState1(restaurantid);
    }

    @Override
    public List<order> OrderState3(int restaurantid) {
        return orderUtilMapper.OrderState3(restaurantid);
    }

    @Override
    public List<order> OrderState5(int restaurantid) {
        return orderUtilMapper.OrderState5(restaurantid);
    }
}
