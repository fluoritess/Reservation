package com.shan.reservation.service;

import com.shan.reservation.bean.order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wsw
 * @Package com.gabe.mychat.service
 * @Description:
 * @date 2020年2月1日 18:17:12
 */
@Service
public interface OrderService {
    List<order> selectByUserId(int userId);
    void deleteByNo(String orderNo);
    //修改状态为-1
    void deleteByNo2(String orderNo);
    //修改订单状态为1
    void uodateByNo1(String orderNo);
    //添加订单
    void addOrder(order order);
    //查询订单
    order selectOrder(String orderNo);
    //商家查询订单
    List<order> ResSelectOrder(int restaurantid);
    //商家查询一天内订单
    List<order> OrderLimitOneDay(int restaurantid);
    //商家查询一周内订单
    List<order> OrderLimitOneWeek(int restaurantid);
    //上海查询一个月内订单
    List<order> OrderLimitOneMonth(int restaurantid);
    //商家查询未发货订单
    List<order> OrderState1(int restaurantid);
    //商家查询未评价订单
    List<order> OrderState3(int restaurantid);
    //商家查询申请取消订单
    List<order> OrderState5(int restaurantid);
    //发货
    void updateState2(String orderno);
    //计算一天内销售总额
    BigDecimal SalePriceOneDay(int restaurantid);
    //计算一周内销售总额
    BigDecimal SalePriceOneWeek(int restaurantid);
    //计算一月内销售总额
    BigDecimal SalePriceOneMonth(int restaurantid);
}
