package com.shan.reservation.mapper;

import com.shan.reservation.bean.restaurant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface restaurantUtilMapper {
    List<restaurant> selectRestaurantByCateId(int foodCategoryId);
}