package com.shan.reservation.mapper;

import com.shan.reservation.bean.coupon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface couponMapperUtil {
    List<coupon> selectCouPonByUser(int userId);
}
