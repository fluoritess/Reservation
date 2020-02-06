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
            String logo=list.get(i).getLogo();
            String describe=list.get(i).getRestaurantDescribe();
            restaurantUtil restaurantUtil_BEAN=new restaurantUtil(restaurant_id,password,address_4,restaurantPhone,name,state,cate_name,score,image,describe,logo);
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

    @Override
    public List<restaurantUtil> findRestaurantByAddressAndCate(String CateName, String address) {
        List<food_category> catelist=food_categoryMapper.selectByExample(null);
        List<address> addresslist=addressMapper.selectByExample(null);
        List<restaurant> list=new ArrayList<>();
        List<restaurantUtil> tarlist=new ArrayList<restaurantUtil>();
        int cate_id_=0;
        int address_id_=0;
        Iterator it=catelist.iterator();
        while(it.hasNext()){
            food_category food_category=(com.shan.reservation.bean.food_category)it.next();
            if(CateName.equals(food_category.getCategoryName())){
                cate_id_=food_category.getFoodCategoryId();
            }
        }
        Iterator it2=addresslist.iterator();
        while(it2.hasNext()){
            address address1=(com.shan.reservation.bean.address)it2.next();
            if(address.equals(address1.getAddressDistrict())){
                address_id_=address1.getAddressId();
                break;
            }
        }
        list=restaurantUtilMapper.findRestaurantByAddressAndCate(cate_id_,address_id_);
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

    @Override
    public restaurantUtil findRestaurantById(int id) {
        restaurant restaurant=restaurantMapper.selectByPrimaryKey(id);
        int address_id=restaurant.getRestaurantAddress();
        int cate_id=restaurant.getRestaurantCategoryId();
        int  restaurant_id=restaurant.getRestaurantId();
        String password=restaurant.getRestaurantPassword();
        address address_=addressMapper.selectByPrimaryKey(address_id);
        String address_1=address_.getAddressCity();
        String address_2=address_.getAddressDistrict();
        String address_3=address_.getAddressStreet();
        String address_4=address_1+address_2+address_3;
        String restaurantPhone=restaurant.getRestaurantPhone();
        String name=restaurant.getRestaurantName();
        int state=restaurant.getRestaurantState();
        food_category category=food_categoryMapper.selectByPrimaryKey(cate_id);
        String cate_name=category.getCategoryName();
        double score=restaurant.getScore();
        String image=restaurant.getRestaurantImage();
        int cllection=restaurant.getCollection();
        String describe=restaurant.getRestaurantDescribe();
        int wifi=restaurant.getWifi();
        int parkingspace=restaurant.getParkingspace();
        String logo=restaurant.getLogo();
        double averageprice=restaurant.getAverageprice();
        restaurantUtil restaurantUtil_BEAN=new restaurantUtil(restaurant_id,password,address_4,restaurantPhone,name,state,cate_name,score,image,cllection,describe,wifi,parkingspace,logo,averageprice);
        return restaurantUtil_BEAN;
    }

    @Override
    public List<restaurantUtil> findhotshop() {
        List<restaurant> list=restaurantUtilMapper.findhotshop();
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
    public List<restaurantUtil> selectByName(String restaurantName) {
        List<restaurant> list=restaurantUtilMapper.selectByName(restaurantName);
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

}
