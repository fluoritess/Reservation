package com.shan.reservation.service;

import com.shan.reservation.bean.coupon;
import com.shan.reservation.bean.couponUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsw
 * @Package com.shan.reservation.service
 * @Description:优惠卷service
 * @date 2020年2月3日 16:35:39
 */
@Service
public interface CouPonService {
    //根据用户id查询用户名称
    List<couponUtil>  selectCouPonByUser(int userId);
}
