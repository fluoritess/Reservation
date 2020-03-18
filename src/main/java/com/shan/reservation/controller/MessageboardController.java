package com.shan.reservation.controller;

import com.shan.reservation.bean.food;
import com.shan.reservation.bean.messageboard;
import com.shan.reservation.bean.user;
import com.shan.reservation.mapper.itemMapperUtil;
import com.shan.reservation.service.FoodService;
import com.shan.reservation.service.UserService;
import com.shan.reservation.service.messageboardService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.shan.reservation.controller
 * @Description:留言controller
 * @date 2020年3月18日 21:55:32
 */
@Controller
@RequestMapping("/messageBoard" )
public class MessageboardController {
    @Autowired
    messageboardService messageboardService;
    @Autowired
    com.shan.reservation.service.UserService UserService;
    @ResponseBody
    @RequestMapping("/selectMessageByRe" )
    @ArchivesLog(operationType = "查询", operationName = "根据商家id查询留言")
    public R selectMessageByRe(@RequestBody Map<String,String> map, HttpSession httpSession){
//        String title=map.get("title");
      Integer id=Integer.parseInt(map.get("id"));
        List<messageboard> message= messageboardService.selectMessageByRe(id);
        List<String> name=new ArrayList<>();
        List<String> content=new ArrayList<>();
        Iterator it=message.iterator();
        while (it.hasNext()){
            messageboard messageboard=(messageboard)it.next();
            int user_id=messageboard.getUserId();
            user user=UserService.selectUserById(user_id);
            String userName=user.getUserName();
            name.add(userName);
            String content_=messageboard.getContent();
            content.add(content_);
        }
        return  R.ok().put("name",name).put("content",content);
    }

}
