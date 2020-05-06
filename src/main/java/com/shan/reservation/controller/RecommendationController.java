package com.shan.reservation.controller;

import com.shan.reservation.bean.*;
import com.shan.reservation.service.*;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
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
 * @Description:推荐controller
 * @date 2020年3月12日 14:39:28
 */
@Controller
@RequestMapping("/Recommendation")
public class RecommendationController {
    @Autowired
    PearsonService PearsonService;
    @Autowired
    com.shan.reservation.service.EvaluationService EvaluationService;
    @Autowired
    OrderService OrderService;
    @Autowired
    RestaurantService RestaurantService;
    @Autowired
    com.shan.reservation.service.CollectService CollectService;
    @ResponseBody
    @RequestMapping("/Pearson" )
    @ArchivesLog(operationType = "推荐", operationName = "使用皮尔逊推荐算法")
    public R Pearson(@RequestBody Map<String,String> map, HttpSession httpSession){
       Integer id=Integer.parseInt(map.get("user_id"));
//       String orderno=map.get("orderno");
//       order oreder=OrderService.selectOrder(orderno);
        //-----------------用户评价列表---------------------------
       List<evaluation> evaluations=EvaluationService.selectByuserId(id);
       List<evaluation> evaluations2=EvaluationService.selectByuserId(1);
        //-----------------统一长度------------------------------
       int size=0;
        if(evaluations.size()<evaluations2.size()){
           size=evaluations.size();
       }
       else{
           size=evaluations2.size();
       }
       //------------------------生成推荐列表------------------------
        double[] arr=new double[size];
        double[] arr2=new double[size];
        Iterator it=evaluations.iterator();
        int count=0;
        int count2=0;
        while(it.hasNext()&&count<size){
            evaluation evaluation=(evaluation)it.next();
            double score=evaluation.getScore();
            int re_id=evaluation.getRestaurantId();
            Iterator it2=evaluations2.iterator();
            while(it2.hasNext()){
                evaluation evaluation_=(evaluation)it2.next();
                double score_=evaluation_.getScore();
                int re_id2=evaluation_.getRestaurantId();
                if(re_id==re_id2){
                    arr[count]=score;
                    arr2[count2]=score_;
                    count2++;
                    break;
                }
            }
            count++;
            //-------------------------------count2<count是因为该栏本两用户没有进行共同评价，为了使评分矩阵规整进行修正--------------------------------
            if(count2<count){
                count--;
            }
        }
        //-------------------------------评分--------------------------------
        double score=PearsonService.CalculationPearson(arr,arr2);
        //-------------------------------推荐--------------------------------
        if(score>=0.4){
            List<collectUtil> list=CollectService.selectByUser(1);
            List<restaurantUtil> restaurantUtil=new ArrayList<>();
            for(collectUtil c:list){
                int re_id=c.getRestaurantId();
                restaurantUtil restaurantUtil1=RestaurantService.findRestaurantById(re_id);
                restaurantUtil.add(restaurantUtil1);
            }
            return R.ok().put("restaurant",restaurantUtil);
        }
        return  R.ok().put("score",score);
    }

}
