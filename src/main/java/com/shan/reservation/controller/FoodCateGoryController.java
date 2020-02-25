package com.shan.reservation.controller;

import com.shan.reservation.bean.food;
import com.shan.reservation.bean.food_category;
import com.shan.reservation.mapper.food_categoryMapper;
import com.shan.reservation.service.FoodService;
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
 * @Description:菜品controller
 * @date 2020年2月25日 15:58:08
 */
@Controller
public class FoodCateGoryController {
    @Autowired
    food_categoryMapper food_categoryMapper;
    @ResponseBody
    @RequestMapping("/findFoodCateGory" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询所有食物")
    public R findFoodCateGory(@RequestBody Map<String,String> map, HttpSession httpSession){
        int categoryId=Integer.parseInt(map.get("categoryId"));
        food_category food_category=food_categoryMapper.selectByPrimaryKey(categoryId);
        String CateName=food_category.getCategoryName();
        return  R.ok().put("CateName",CateName);
    }
}
