package com.shan.reservation.service.impl;

import com.shan.reservation.bean.address;
import com.shan.reservation.bean.food_category;
import com.shan.reservation.bean.restaurant;
import com.shan.reservation.bean.restaurantUtil;
import com.shan.reservation.mapper.addressMapper;
import com.shan.reservation.mapper.food_categoryMapper;
import com.shan.reservation.mapper.restaurantMapper;
import com.shan.reservation.mapper.restaurantUtilMapper;
import com.shan.reservation.service.RestaurantService;
import jdk.nashorn.internal.runtime.arrays.IteratorAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    restaurantMapper restaurantMapper;
    @Autowired
    addressMapper addressMapper;
    @Autowired
    food_categoryMapper food_categoryMapper;
    @Autowired
    restaurantUtilMapper restaurantUtilMapper;
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
            double score=list.get(i).getScore();
            String image=list.get(i).getRestaurantImage();
            restaurantUtil restaurantUtil_BEAN=new restaurantUtil(restaurant_id,password,address_4,restaurantPhone,name,state,cate_name,score,image);
            tarlist.add(restaurantUtil_BEAN);
        }
        return tarlist;
    }

    @Override
    public List<restaurantUtil> findRestaurantByCate(String CateName) {
        List<food_category> catelist=food_categoryMapper.selectByExample(null);
        List<restaurant> list=new ArrayList<>();
        List<restaurantUtil> tarlist=new ArrayList<restaurantUtil>();
        Iterator it=catelist.iterator();
        while(it.hasNext()){
            food_category food_category=(com.shan.reservation.bean.food_category)it.next();
            if(CateName.equals(food_category.getCategoryName())){
                    int cate_id=food_category.getFoodCategoryId();
                    list=restaurantUtilMapper.selectRestaurantByCateId(cate_id);
            }
        }
        if(list!=null){
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
                double score=list.get(i).getScore();
                String image=list.get(i).getRestaurantImage();
                restaurantUtil restaurantUtil_BEAN=new restaurantUtil(restaurant_id,password,address_4,restaurantPhone,name,state,cate_name,score,image);
                tarlist.add(restaurantUtil_BEAN);
            }
        }
        return tarlist;
    }

    @Override
    public List<restaurantUtil> findRestaurantByAddress(String address) {
        List<address> addresslist=addressMapper.selectByExample(null);
        List<restaurant> list=new ArrayList<>();
        List<restaurantUtil> tarlist=new ArrayList<restaurantUtil>();
        Iterator it=addresslist.iterator();
        while(it.hasNext()){
            address address1=(com.shan.reservation.bean.address)it.next();
            if(address.equals(address1.getAddressDistrict())){
                int address_id=address1.getAddressId();
                list=restaurantUtilMapper.selectRestaurantByAddressId(address_id);
            }
        }
        if(list!=null){
            for(int i=0;i<list.size();i++){
                int address_id=list.get(i).getRestaurantAddress();
                int cate_id=list.get(i).getRestaurantCategoryId();
                int  restaurant_id=list.get(i).getRestaurantId();
                String password=list.get(i).getRestaurantPassword();
                address address_=addressMapper.selectByPrimaryKey(address_id);
                String address_1=address_.getAddressCity();
                String address_2=address_.getAddressDistrict();
                String address_3=address_.getAddressStreet();
                String address_4=address_1+address_2+address_3;
                String restaurantPhone=list.get(i).getRestaurantPhone();
                String name=list.get(i).getRestaurantName();
                int state=list.get(i).getRestaurantState();
                food_category category=food_categoryMapper.selectByPrimaryKey(cate_id);
                String cate_name=category.getCategoryName();
                double score=list.get(i).getScore();
                String image=list.get(i).getRestaurantImage();
                restaurantUtil restaurantUtil_BEAN=new restaurantUtil(restaurant_id,password,address_4,restaurantPhone,name,state,cate_name,score,image);
                tarlist.add(restaurantUtil_BEAN);
            }
        }
        return tarlist;
    }

}
