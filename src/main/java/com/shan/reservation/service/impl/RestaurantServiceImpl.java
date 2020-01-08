package com.shan.reservation.service.impl;

import com.shan.reservation.bean.address;
import com.shan.reservation.bean.food_category;
import com.shan.reservation.bean.restaurant;
import com.shan.reservation.bean.restaurantUtil;
import com.shan.reservation.mapper.addressMapper;
import com.shan.reservation.mapper.food_categoryMapper;
import com.shan.reservation.mapper.restaurantMapper;
import com.shan.reservation.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    restaurantMapper restaurantMapper;
    @Autowired
    addressMapper addressMapper;
    @Autowired
    food_categoryMapper food_categoryMapper;
    @Override
    public List<restaurantUtil> findAllRestaurant() {
        List<restaurant> list=restaurantMapper.selectByExample(null);
        List<restaurantUtil> tarlist=new ArrayList<restaurantUtil>();
        for(int i=0;i<list.size();i++){
            int address_id=list.get(i).getRestaurantAddress();
            int cate_id=list.get(i).getRestaurantCategoryId();
            int  restaurant_id=list.get(i).getRestaurantId();
            String password=list.get(i).getRestaurantPassword();
            address address=addressMapper.selectByPrimaryKey(address_id);
            String address_1=address.getAddressCity();
            String address_2=address.getAddressDistrict();
            String address_3=address.getAddressStreet();
            String address_4=address_1+address_2+address_3;
            String restaurantPhone=list.get(i).getRestaurantPhone();
            String name=list.get(i).getRestaurantName();
            int state=list.get(i).getRestaurantState();
            food_category category=food_categoryMapper.selectByPrimaryKey(cate_id);
            String cate_name=category.getCategoryName();
            restaurantUtil restaurantUtil_BEAN=new restaurantUtil(restaurant_id,password,address_4,restaurantPhone,name,state,cate_name);
            tarlist.add(restaurantUtil_BEAN);
        }
        return tarlist;
    }
}
