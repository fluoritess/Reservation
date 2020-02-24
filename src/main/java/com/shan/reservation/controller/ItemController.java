package com.shan.reservation.controller;

import com.shan.reservation.bean.food;
import com.shan.reservation.bean.notice;
import com.shan.reservation.mapper.itemMapperUtil;
import com.shan.reservation.service.FoodService;
import com.shan.reservation.service.NoticeService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.FontDescriptor;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.gabe.mychat.controller
 * @Description:购物车controller
 * @date 2020年2月24日 18:40:46
 */
@Controller
public class ItemController {
    @Autowired
    FoodService FoodService;
    @Autowired
    itemMapperUtil itemMapperUtil;
    @ResponseBody
    @RequestMapping("/deleteItem" )
    @ArchivesLog(operationType = "删除信息", operationName = "删除购物车")
    public R selectNoticeByName(@RequestBody Map<String,String> map, HttpSession httpSession){
//        String title=map.get("title");
       String foodName=map.get("name");
        List<food> foodlist= FoodService.selectByName(foodName);
        int id=foodlist.get(0).getFoodId();
        itemMapperUtil.deleteByFoodId(id);
       System.out.print(foodName);
       return  R.ok();
    }
}
