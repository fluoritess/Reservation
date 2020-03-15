package com.shan.reservation.mapper;

import com.shan.reservation.bean.restaurant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface restaurantUtilMapper {
    List<restaurant> selectRestaurantByCateId(int foodCategoryId);
    List<restaurant> selectRestaurantByAddressId(int addressId);
    List<restaurant> findRestaurantByAddressAndCate(int foodCategoryId,int addressId);
    List<restaurant> findhotshop();
    List<restaurant> selectByName(String restaurantName);
    int ReAddCollect(int restaurantId);
    int RereduceCollect(int restaurantId);
}
