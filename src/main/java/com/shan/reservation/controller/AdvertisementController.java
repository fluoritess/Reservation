package com.shan.reservation.controller;

import com.shan.reservation.bean.admin;
import com.shan.reservation.bean.advertisement;
import com.shan.reservation.service.AdminService;
import com.shan.reservation.service.advertisementService;
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
 * @Description:广告controller
 * @date 2020年2月27日 15:45:22
 */
@Controller
@RequestMapping("/advertisement" )
public class AdvertisementController {
    @Autowired
    advertisementService advertisementService;
    @ResponseBody
    @RequestMapping("/resTaurantSelectAdvertise" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询广告信息")
    public R resTaurantSelectAdvertise(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer re_id=Integer.parseInt(map.get("re_id"));
        List<advertisement> list= advertisementService.resTaurantSelectAdvertise(re_id);
        return  R.ok().put("advertisement",list);
    }
}
