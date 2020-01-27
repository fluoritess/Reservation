package com.shan.reservation.service;

import com.shan.reservation.bean.cartutil;
import com.shan.reservation.bean.item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    //根据用户id查询购物车
    List<cartutil> findCartByuser(int userid);
}
