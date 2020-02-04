package com.shan.reservation.controller;

import com.shan.reservation.bean.city_info;
import com.shan.reservation.bean.collect;
import com.shan.reservation.bean.collectUtil;
import com.shan.reservation.service.CollectService;
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
 * @Description:收藏夹controller
 * @date 2020年1月6日 13:34:28
 */
@Controller
public class CollectController {
    @Autowired
    CollectService CollectService;
    @ResponseBody
    @RequestMapping("/selectCollectByUser" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询收藏夹信息")
    public R selectCollectByUser(@RequestBody Map<String,String> map, HttpSession httpSession){
       int user_id=Integer.parseInt(map.get("userId"));
        List<collectUtil> list=CollectService.selectByUser(user_id);
        return  R.ok().put("collect",list);
    }
}
