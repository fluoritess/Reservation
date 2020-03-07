package com.shan.reservation.service.impl;

import com.shan.reservation.bean.order;
import com.shan.reservation.mapper.orderMapper;
import com.shan.reservation.mapper.orderUtilMapper;
import com.shan.reservation.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Iterator;
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
    public void uodateByNo4(String orderNo) {
        orderUtilMapper.updateByNo4(orderNo);
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
    public List<order> OrderLimitOneMonth(int restaurantid) {
        return orderUtilMapper.OrderLimitOneMonth(restaurantid);
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

    @Override
    public void updateState2(String orderno) {
        orderUtilMapper.updateState2(orderno);
    }

    @Override
    public BigDecimal SalePriceOneDay(int restaurantid) {
        List<order> list= orderUtilMapper.OrderLimitOneDay(restaurantid);
        Iterator it=list.iterator();
        BigDecimal totalPrice=new BigDecimal(0);
        while(it.hasNext()){
            order order=(order)it.next();
            BigDecimal price=order.getPrice();
            totalPrice=totalPrice.add(price);
        }
        return totalPrice;
    }

    @Override
    public BigDecimal SalePriceOneWeek(int restaurantid) {
        List<order> list= orderUtilMapper.OrderLimitOneWeek(restaurantid);
        Iterator it=list.iterator();
        BigDecimal totalPrice=new BigDecimal(0);
        while(it.hasNext()){
            order order=(order)it.next();
            BigDecimal price=order.getPrice();
            totalPrice=totalPrice.add(price);
        }
        return totalPrice;
    }

    @Override
    public BigDecimal SalePriceOneMonth(int restaurantid) {
        List<order> list= orderUtilMapper.OrderLimitOneMonth(restaurantid);
        Iterator it=list.iterator();
        BigDecimal totalPrice=new BigDecimal(0);
        while(it.hasNext()){
            order order=(order)it.next();
            BigDecimal price=order.getPrice();
            totalPrice=totalPrice.add(price);
        }
        return totalPrice;
    }

    @Override
    public List<order> OrderState6OneDay(int restaurantid) {
        return orderUtilMapper.OrderState6OneDay(restaurantid);
    }

    @Override
    public List<order> OrderState6OneWeek(int restaurantid) {
        return orderUtilMapper.OrderState6OneWeek(restaurantid);
    }

    @Override
    public List<order> OrderState6OneMonth(int restaurantid) {
        return orderUtilMapper.OrderState6OneMonth(restaurantid);
    }

    @Override
    public BigDecimal OrderState6OneDayPrice(int restaurantid) {
        List<order> list= orderUtilMapper.OrderState6OneDay(restaurantid);
        Iterator it=list.iterator();
        BigDecimal totalPrice=new BigDecimal(0);
        while(it.hasNext()){
            order order=(order)it.next();
            BigDecimal price=order.getPrice();
            totalPrice=totalPrice.add(price);
        }
        return totalPrice;
    }

    @Override
    public BigDecimal OrderState6OneWeekPrice(int restaurantid) {
        List<order> list= orderUtilMapper.OrderState6OneWeek(restaurantid);
        Iterator it=list.iterator();
        BigDecimal totalPrice=new BigDecimal(0);
        while(it.hasNext()){
            order order=(order)it.next();
            BigDecimal price=order.getPrice();
            totalPrice=totalPrice.add(price);
        }
        return totalPrice;
    }

    @Override
    public BigDecimal OrderState6OneMonthPrice(int restaurantid) {
        List<order> list= orderUtilMapper.OrderState6OneMonth(restaurantid);
        Iterator it=list.iterator();
        BigDecimal totalPrice=new BigDecimal(0);
        while(it.hasNext()){
            order order=(order)it.next();
            BigDecimal price=order.getPrice();
            totalPrice=totalPrice.add(price);
        }
        return totalPrice;
    }
}
