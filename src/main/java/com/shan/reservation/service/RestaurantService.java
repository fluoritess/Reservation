package com.shan.reservation.service;

import com.shan.reservation.bean.address;
import com.shan.reservation.bean.restaurant;
import com.shan.reservation.bean.restaurantUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsw
 * @Package com.gabe.mychat.service
 * @Description:
 * @date 2020年1月8日 16:21:44
 */
@Service
public interface RestaurantService {
    //查询所有餐馆
    List<restaurantUtil> findAllRestaurant();
    //根据分类查询餐馆
    List<restaurantUtil> findRestaurantByCate(String CateName);
    //根据位置查询餐馆
    List<restaurantUtil> findRestaurantByAddress(String address);
    //根据分类与位置查询餐馆
    List<restaurantUtil> findRestaurantByAddressAndCate(String CateName,String address);
    //根据Id查询餐馆
    restaurantUtil findRestaurantById(int id);
    //查询最热餐馆
    List<restaurantUtil> findhotshop();
    List<restaurantUtil> selectByName(String restaurantName);
}
