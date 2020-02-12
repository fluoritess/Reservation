package com.shan.reservation.mapper;

import com.shan.reservation.bean.order;
import com.shan.reservation.bean.orderExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface orderUtilMapper {
    List<order> selectByUserId(int userId);
    void deleteByNo(String orderno);
    void updateByNo(String orderno);
    void updateByNo2(String orderno);
    int insert(order record);
    order selectOrder(String orderNo);
}
