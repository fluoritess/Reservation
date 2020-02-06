package com.shan.reservation.service.impl;

import com.shan.reservation.bean.food;
import com.shan.reservation.mapper.foodMapper;
import com.shan.reservation.mapper.foodUtilMapper;
import com.shan.reservation.mapper.restaurantMapper;
import com.shan.reservation.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    foodMapper foodMapper;
    @Autowired
    restaurantMapper  restaurantMapper;
    @Autowired
    foodUtilMapper foodUtilMapper;
    @Override
    public List<food> findAllFood() {
        List<food> food=foodMapper.selectByExample(null);
        return food;
    }

    @Override
    public List<food> findFoodByRestaurant(int restaurantId) {
        List<food> list=foodMapper.selectByExample(null);
        List<food> tar=new ArrayList<>();
        Iterator it=list.iterator();
        while(it.hasNext()){
            food food=(food)it.next();
            if(food.getRestaurantId()==restaurantId){
                tar.add(food);
            }
        }
        return tar;
    }

    @Override
    public List<food> selectByName(String foodName) {
        List<food> selectByName=foodUtilMapper.selectByName(foodName);
        return selectByName;
    }

}
