package com.shan.reservation.controller;

import com.shan.reservation.bean.evaluation;
import com.shan.reservation.bean.order;
import com.shan.reservation.bean.restaurantUtil;
import com.shan.reservation.service.EvaluationService;
import com.shan.reservation.service.OrderService;
import com.shan.reservation.service.PearsonService;
import com.shan.reservation.service.RestaurantService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.gabe.mychat.controller
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
    @ResponseBody
    @RequestMapping("/Pearson" )
    @ArchivesLog(operationType = "推荐", operationName = "使用皮尔逊推荐算法")
    public R Pearson(@RequestBody Map<String,String> map, HttpSession httpSession){
       Integer id=Integer.parseInt(map.get("user_id"));
       String orderno=map.get("orderno");
       List<evaluation> evaluations=EvaluationService.selectByuserId(id);

//       order order =OrderService.selectOrder(orderno);
        double[] arr=new double[evaluations.size()];
        Iterator it=evaluations.iterator();
        int count=0;
        while(it.hasNext()){
            evaluation evaluation=(evaluation)it.next();
            double score=evaluation.getScore();
            arr[count]=score;
            count++;
        }
        List<evaluation> evaluations2=EvaluationService.selectByuserId(1);
        double[] arr2=new double[evaluations2.size()];
        Iterator it2=evaluations2.iterator();
        int count2=0;
        while(it2.hasNext()){
            evaluation evaluation=(evaluation)it2.next();
            double score=evaluation.getScore();
            arr2[count2]=score;
            count2++;
        }
        double score=PearsonService.CalculationPearson(arr,arr2);
        return  R.ok().put("score",score);
    }

}
