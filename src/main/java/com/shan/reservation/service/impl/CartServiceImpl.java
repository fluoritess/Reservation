package com.shan.reservation.service.impl;

import com.shan.reservation.bean.cartutil;
import com.shan.reservation.bean.food;
import com.shan.reservation.bean.item;
import com.shan.reservation.bean.restaurant;
import com.shan.reservation.mapper.foodMapper;
import com.shan.reservation.mapper.itemMapper;
import com.shan.reservation.mapper.restaurantMapper;
import com.shan.reservation.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    itemMapper itemMapper;
    @Autowired
    foodMapper foodMapper;
    @Autowired
    restaurantMapper restaurantMapper;
    @Override
    public List<cartutil> findCartByuser(int userid) {
        List<item> list=itemMapper.selectByExample(null);
        List<cartutil> tarlist=new ArrayList<>();
        Iterator it=list.iterator();
        while(it.hasNext()){
            item item=(com.shan.reservation.bean.item)it.next();
            if(userid==item.getUserId()){
                food food=foodMapper.selectByPrimaryKey(item.getFoodId());
                String foodName=food.getFoodName();
                double foodPrice=food.getFoodPrice();
                String imag=food.getFoodImage();
                int restaurantid=food.getRestaurantId();
                restaurant restaurant=restaurantMapper.selectByPrimaryKey(restaurantid);
                String restaurantname=restaurant.getRestaurantName();
                double foodbar=food.getFoodBargain();
                int number=item.getNumber();
                cartutil cartuti=new cartutil(foodName,imag,foodPrice,restaurantname,foodbar,number);
                tarlist.add(cartuti);
            }
        }
        return tarlist;
    }
}
