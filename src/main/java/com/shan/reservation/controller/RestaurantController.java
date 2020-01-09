package com.shan.reservation.controller;

import com.shan.reservation.bean.city_info;
import com.shan.reservation.bean.restaurant;
import com.shan.reservation.bean.restaurantUtil;
import com.shan.reservation.mapper.restaurantMapper;
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
 * @Package com.gabe.mychat.controller
 * @Description:
 * @date 2020年1月8日 16:24:41
 */
@Controller
public class RestaurantController {
    @Autowired
    RestaurantService RestaurantService;
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
    @ArchivesLog(operationType = "查询信息", operationName = "根据分类查询餐馆")
    public R findRestaurantByAddress(@RequestBody Map<String,String> map,HttpSession httpSession){
        String address=(String)map.get("address");
        List<restaurantUtil> list= RestaurantService.findRestaurantByAddress(address);
        return  R.ok().put("restaurant",list);
    }
}
