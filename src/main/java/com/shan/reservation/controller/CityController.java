package com.shan.reservation.controller;

import com.shan.reservation.bean.city_info;
import com.shan.reservation.bean.user;
import com.shan.reservation.service.CityService;
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
 * @date 2020年1月6日 13:34:28
 */
@Controller
public class CityController {
    @Autowired
    CityService cityService;
    @ResponseBody
    @RequestMapping("/GetDistictInfo" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据城市名称查询所属区信息")
    public R GetDistictInfo(@RequestBody Map<String,String> map, HttpSession httpSession){
        String city_name=map.get("city_name");
        List<city_info> list=cityService.SelectDistictByCity(city_name);
        return  R.ok().put("distict",list);
    }
}
