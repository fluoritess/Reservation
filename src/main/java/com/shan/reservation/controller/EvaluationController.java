package com.shan.reservation.controller;

import com.shan.reservation.bean.evaluation;
import com.shan.reservation.bean.food;
import com.shan.reservation.bean.user;
import com.shan.reservation.mapper.foodMapper;
import com.shan.reservation.mapper.userMapper;
import com.shan.reservation.service.EvaluationService;
import com.shan.reservation.service.FoodService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author wsw
 * @Package com.gabe.mychat.controller
 * @Description:评价controller
 * @date 2020年1月23日 22:45:58
 */
@Controller
public class EvaluationController {
    @Autowired
    EvaluationService EvaluationService;
    @Autowired
    userMapper  userMapper;
    @Autowired
    foodMapper foodMapper;
    @ResponseBody
    @RequestMapping("/selectReId" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据餐馆id查询评论")
    public R selectReId(@RequestBody Map<String,String> map, HttpSession httpSession){
        int reId=Integer.parseInt(map.get("id"));
        List<evaluation> list=EvaluationService.selectReId(reId);
        List tarlist=new ArrayList();
        Iterator it=list.iterator();
        int size=list.size();
        while(it.hasNext()){
            evaluation evaluation=(evaluation)it.next();
            int user_id=evaluation.getUserId();
            user user=userMapper.selectByPrimaryKey(user_id);
            String username=user.getUserName();
            String content=evaluation.getEvaluationContent();
            Date date=evaluation.getEvaluationData();
            int food_id=evaluation.getFoodId();
            food food=foodMapper.selectByPrimaryKey(food_id);
            String foodname=food.getFoodName();
            Map data=new HashMap();
            data.put("size",size);
            data.put("username",username);
            data.put("content",content);
            data.put("date",date);
            data.put("foodname",foodname);
            data.put("foodid",food_id);
            tarlist.add(data);
        }
        return  R.ok().put("data",tarlist);
    }
    @ResponseBody
    @RequestMapping("/selectByFoodId" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据餐馆id查询评论")
    public R selectByFoodId(@RequestBody Map<String,String> map, HttpSession httpSession){
        int reId=Integer.parseInt(map.get("id"));
        List<evaluation> list=EvaluationService.selectByFoodId(reId);
        List tarlist=new ArrayList();
        Iterator it=list.iterator();
        int size=list.size();
        while(it.hasNext()){
            evaluation evaluation=(evaluation)it.next();
            int user_id=evaluation.getUserId();
            user user=userMapper.selectByPrimaryKey(user_id);
            String username=user.getUserName();
            String content=evaluation.getEvaluationContent();
            Date date=evaluation.getEvaluationData();
            int food_id=evaluation.getFoodId();
            food food=foodMapper.selectByPrimaryKey(food_id);
            String foodname=food.getFoodName();
            Map data=new HashMap();
            data.put("size",size);
            data.put("username",username);
            data.put("content",content);
            data.put("date",date);
            data.put("foodname",foodname);
            data.put("foodid",food_id);
            tarlist.add(data);
        }
        return  R.ok().put("data",tarlist);
    }
}
