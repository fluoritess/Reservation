package com.shan.reservation.controller;

import com.shan.reservation.bean.*;
import com.shan.reservation.mapper.foodUtilMapper;
import com.shan.reservation.mapper.restaurantMapper;
import com.shan.reservation.service.FoodService;
import com.shan.reservation.service.RestaurantService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.shan.reservation.controller
 * @Description:餐馆controller
 * @date 2020年1月8日 16:24:41
 */
@Controller
public class RestaurantController {
    @Autowired
    RestaurantService RestaurantService;
    @Autowired
    foodUtilMapper foodUtilMapper;
    @ResponseBody
    @RequestMapping("/findAllRestaurant" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询所有餐馆")
    public R findAllRestaurant(HttpSession httpSession){
        List<restaurantUtil> list= RestaurantService.findAllRestaurant();
        return  R.ok().put("restaurant",list);
    }

    @ResponseBody
    @RequestMapping("/findRestaurantByCate" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据分类查询餐馆")
    public R findRestaurantByCate(@RequestBody Map<String,String> map,HttpSession httpSession){
        String cate=(String)map.get("cate");
        List<restaurantUtil> list= RestaurantService.findRestaurantByCate(cate);
        return  R.ok().put("restaurant",list);
    }

    @ResponseBody
    @RequestMapping("/findRestaurantByAddress" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据地址查询餐馆")
    public R findRestaurantByAddress(@RequestBody Map<String,String> map,HttpSession httpSession){
        String address=(String)map.get("address");
        List<restaurantUtil> list= RestaurantService.findRestaurantByAddress(address);
        return  R.ok().put("restaurant",list);
    }

    @ResponseBody
    @RequestMapping("/findRestaurantByAddressAndCate" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据分类与地址查询餐馆")
    public R findRestaurantByAddressAndCate(@RequestBody Map<String,String> map,HttpSession httpSession){
        String cate=(String)map.get("cate");
        String address=(String)map.get("address");
        List<restaurantUtil> list= RestaurantService.findRestaurantByAddressAndCate(cate,address);
        return  R.ok().put("restaurant",list);
    }

    @ResponseBody
    @RequestMapping("/findRestaurantById" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据Id查询餐馆")
    public R findRestaurantById(@RequestBody Map<String,String> map,HttpSession httpSession){
        int id=Integer.parseInt(map.get("id"));
        restaurantUtil restaurant= RestaurantService.findRestaurantById(id);
        return  R.ok().put("restaurant",restaurant);
    }
    @ResponseBody
    @RequestMapping("/findHotRestaurant" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询最热餐馆")
    public R findHotRestaurant(HttpSession httpSession){
        List<restaurantUtil> restaurant= RestaurantService.findhotshop();
        return  R.ok().put("restaurant",restaurant);
    }
    @ResponseBody
    @RequestMapping("/selectResByName" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据食物名称查询食物")
    public R selectByName(@RequestBody Map<String,String> map, HttpSession httpSession){
        String restaurantName=map.get("restaurantName");
        List<restaurantUtil> restaurantUtil= RestaurantService.selectByName(restaurantName);
        return  R.ok().put("restaurant",restaurantUtil);
    }
    @ResponseBody
    @RequestMapping("/restaurantUpdateFood" )
    @ArchivesLog(operationType = "修改信息", operationName = "餐馆更新食物信息")
    public R restaurantUpdateFood(@RequestBody Map<String,String> map, HttpSession httpSession){
        String foodName=map.get("foodName");
//        Double foodPrice, Double foodBargain, String foodName, Integer categoryId, String foodDescribe, Integer stock, Integer foodState
        Integer categoryId=Integer.parseInt(map.get("categoryId"));
        Integer foodId=Integer.parseInt(map.get("foodId"));
        Double foodPrice=Double.parseDouble(map.get("foodPrice"));
        Double foodBargain=Double.parseDouble(map.get("foodBargain"));
        String foodDescribe=map.get("foodDescribe");
        Integer stock=Integer.parseInt(map.get("stock"));
        foodUtilMapper.shopUpdateFood(foodPrice,foodBargain,foodName,categoryId,foodDescribe,stock,1,foodId);
        return  R.ok();
    }

    @ResponseBody
    @RequestMapping("/restaurantLogin" )
    @ArchivesLog(operationType = "登陆操作", operationName = "商家登陆")
    public R restaurantLogin(@RequestBody Map<String,String> map, HttpSession httpSession){
        String restaurantName=map.get("restaurantName");
        String passowrd=map.get("password");
        List<restaurantUtil> re=RestaurantService.selectByName(restaurantName);
        if(re!=null){
            String password_=re.get(0).getRestaurantPassword();
            if(password_.equals(passowrd)){
                int re_id=re.get(0).getRestaurantId();
                return R.ok().put("restaurant",restaurantName).put("re_id",re_id);
            }
        }
        return  R.error();
    }
}
