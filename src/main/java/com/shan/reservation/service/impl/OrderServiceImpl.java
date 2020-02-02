package com.shan.reservation.service.impl;

import com.shan.reservation.bean.order;
import com.shan.reservation.mapper.orderUtilMapper;
import com.shan.reservation.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    orderUtilMapper orderUtilMapper;
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
}
