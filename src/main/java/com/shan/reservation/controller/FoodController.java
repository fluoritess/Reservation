package com.shan.reservation.controller;

import com.shan.reservation.bean.food;
import com.shan.reservation.bean.restaurantUtil;
import com.shan.reservation.mapper.foodMapper;
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
 * @Description:菜品controller
 * @date 2020年1月14日 18:38:51
 */
@Controller
public class FoodController {
    @Autowired
    FoodService FoodService;
    @Autowired
    foodMapper foodMapper;
    @ResponseBody
    @RequestMapping("/findAllFood" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询所有食物")
    public R findAllFood(HttpSession httpSession){
        List<food> list= FoodService.findAllFood();
        return  R.ok().put("food",list);
    }
    @ResponseBody
    @RequestMapping("/findFoodByRestaurant" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据餐馆id查询食物")
    public R findFoodByRestaurant(@RequestBody Map<String,String> map, HttpSession httpSession){
        int foodId=Integer.parseInt(map.get("id"));
        List<food> list= FoodService.findFoodByRestaurant(foodId);
        return  R.ok().put("food",list);
    }
    @ResponseBody
    @RequestMapping("/findFoodById" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据食物id查询食物")
    public R findFoodById(@RequestBody Map<String,String> map, HttpSession httpSession){
        int foodId=Integer.parseInt(map.get("id"));
        food food= foodMapper.selectByPrimaryKey(foodId);
        return  R.ok().put("food",food);
    }

    @ResponseBody
    @RequestMapping("/selectFoodByName" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据食物名称查询食物")
    public R selectByName(@RequestBody Map<String,String> map, HttpSession httpSession){
        String foodName=map.get("foodName");
        List<food> food= FoodService.selectByName(foodName);
        return  R.ok().put("food",food);
    }

}
