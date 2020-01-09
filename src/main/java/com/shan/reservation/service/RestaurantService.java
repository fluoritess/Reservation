package com.shan.reservation.service;

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
    List<restaurantUtil> findAllRestaurant();
    List<restaurantUtil> findRestaurantByCate(String CateName);
}
