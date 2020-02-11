package com.shan.reservation.service;

import com.shan.reservation.bean.order;
import org.springframework.stereotype.Service;

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
}
