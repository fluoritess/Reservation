package com.shan.reservation.controller;

import com.shan.reservation.bean.food;
import com.shan.reservation.bean.order;
import com.shan.reservation.service.FoodService;
import com.shan.reservation.service.OrderService;
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
 * @Description:订单controller
 * @date 2020年1月14日 18:38:51
 */
@Controller
public class OrderController {
    @Autowired
    OrderService OrderService;
    @ResponseBody
    @RequestMapping("/selectOrderByUserId" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询用户订单信息")
    public R selectOrderByUserId(@RequestBody Map<String,String> map, HttpSession httpSession){
        int userId=Integer.parseInt(map.get("userId"));
        List<order> list=OrderService.selectByUserId(userId);
        return  R.ok().put("order",list);
    }
}
