package com.shan.reservation.service;

import com.shan.reservation.bean.food;
import com.shan.reservation.bean.restaurant;
import com.shan.reservation.bean.restaurantUtil;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author wsw
 * @Package com.shan.reservation.service
 * @Description:
 * @date 2020年1月14日 18:37:48
 */
@Service
public interface FoodService {
    //查询所有食品
    List<food> findAllFood();
    //根据餐馆id查询食品
    List<food> findFoodByRestaurant(int restaurantId);
    //根据食物名称查询
    List<food> selectByName(String foodName);
}
