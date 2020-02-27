package com.shan.reservation.mapper;

import com.shan.reservation.bean.food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface foodUtilMapper {
    List<food> selectByName(String foodName);
    int shopUpdateFood(Double foodPrice, Double foodBargain, String foodName, Integer categoryId, String foodDescribe, Integer stock, Integer foodState,int foodId );
}
