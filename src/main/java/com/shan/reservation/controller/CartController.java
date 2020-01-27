package com.shan.reservation.controller;

import com.shan.reservation.bean.cartutil;
import com.shan.reservation.bean.city_info;
import com.shan.reservation.bean.item;
import com.shan.reservation.bean.user;
import com.shan.reservation.mapper.itemMapper;
import com.shan.reservation.service.CartService;
import com.shan.reservation.service.CityService;
import com.shan.reservation.service.UserService;
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
 * @Description:购物车controller
 * @date 2020年1月27日 18:24:23
 */
@Controller
public class CartController {
    @Autowired
    CartService cartService;
    @Autowired
    itemMapper itemMapper;
    @Autowired
    UserService UserService;
    @ResponseBody
    @RequestMapping("/findCartByuser" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据用户id查询购物车")
    public R findCartByuser(@RequestBody Map<String,String> map, HttpSession httpSession){
        String username=map.get("name");
        user user=UserService.selectUserByNickName(username);
        int user_id=user.getUserId();
        List<cartutil> list=cartService.findCartByuser(user_id);
        return  R.ok().put("cart",list);
    }

    @ResponseBody
    @RequestMapping("/InsertCartByuser" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据用户id查询添加购物车")
    public R InsertCartByuser(@RequestBody Map<String,String> map, HttpSession httpSession){
        String username=map.get("username");
        int food_id=Integer.parseInt(map.get("foodid"));
        int number=Integer.parseInt(map.get("number"));
        user user=UserService.selectUserByNickName(username);
        int user_id=user.getUserId();
        item item=new item(user_id,food_id,number);
        if(itemMapper.insert(item)==1){
            return R.ok();
        };
        return  R.error();
    }
}
