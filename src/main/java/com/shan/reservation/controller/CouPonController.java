package com.shan.reservation.controller;

import com.shan.reservation.bean.city_info;
import com.shan.reservation.bean.coupon;
import com.shan.reservation.bean.couponUtil;
import com.shan.reservation.service.CouPonService;
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
 * @Description:优惠卷controller
 * @date 2020年1月6日 13:34:28
 */
@Controller
public class CouPonController {
    @Autowired
    CouPonService CouPonService;
    @ResponseBody
    @RequestMapping("/selectCouPonByUser" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询用户优惠卷")
    public R selectCouPonByUser(@RequestBody Map<String,String> map, HttpSession httpSession){
       int userId=Integer.parseInt(map.get("userId"));
       List<couponUtil> coupon=CouPonService.selectCouPonByUser(userId);
       return  R.ok().put("coupon",coupon);
    }
}
