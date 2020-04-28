package com.shan.reservation.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shan.reservation.bean.food;
import com.shan.reservation.bean.restaurantUtil;
import com.shan.reservation.mapper.foodMapper;
import com.shan.reservation.service.FoodService;
import com.shan.reservation.service.RestaurantService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.shan.reservation.controller
 * @Description:菜品controller
 * @date 2020年1月14日 18:38:51
 */
@Controller
public class FoodController {
    @Autowired
    FoodService FoodService;
    @Autowired
    foodMapper foodMapper;
    @ResponseBody
    @RequestMapping("/findAllFood" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询所有食物")
    public R findAllFood(HttpSession httpSession){
        List<food> list= FoodService.findAllFood();
        return  R.ok().put("food",list);
    }
    @ResponseBody
    @RequestMapping("/findFoodByRestaurant" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据餐馆id查询食物")
    public R findFoodByRestaurant(@RequestBody Map<String,String> map, HttpSession httpSession){
        int foodId=Integer.parseInt(map.get("id"));
        List<food> list= FoodService.findFoodByRestaurant(foodId);
        return  R.ok().put("food",list);
    }
    @ResponseBody
    @RequestMapping("/findFoodById" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据食物id查询食物")
    public R findFoodById(@RequestBody Map<String,String> map, HttpSession httpSession){
        int foodId=Integer.parseInt(map.get("id"));
        food food= foodMapper.selectByPrimaryKey(foodId);
        return  R.ok().put("food",food);
    }

    @ResponseBody
    @RequestMapping("/selectFoodByName" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据食物名称查询食物")
    public R selectByName(@RequestBody Map<String,String> map, HttpSession httpSession){
        String foodName=map.get("foodName");
        List<food> food= FoodService.selectByName(foodName);
        return  R.ok().put("food",food);
    }
    @ResponseBody
    @RequestMapping("/findAllFoodByPage" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询所有食物")
    public PageInfo findAllFoodByPage(@RequestBody Map<String,String> map,HttpSession httpSession){
        int pageNo=Integer.parseInt(map.get("pageNo"));
        int pageSize=Integer.parseInt(map.get("pageSize"));
        PageHelper.startPage(pageNo,pageSize);
        List<food> food= FoodService.findAllFood();
        PageInfo<food> pageInfo=new PageInfo<food>(food);
        return  pageInfo;
    }
    @ResponseBody
    @RequestMapping("/uploadFoodImage" )
    @ArchivesLog(operationType = "上传", operationName = "上传菜品图片")
    public R uploadAdImage(@RequestParam("file") MultipartFile file, HttpSession httpSession) {
        //目前这里是写死的本地硬盘路径
        String path = "F:/reservation/src/main/resources/static/upload/food";
        /*       logger.info("path:" + path);*/
        //获取文件名称
        String fileName = file.getOriginalFilename();
        //获取文件名后缀
        Calendar currTime = Calendar.getInstance();
        //获取文件名后缀
        String suffix = fileName.substring(file.getOriginalFilename().lastIndexOf("."));
        suffix = suffix.toLowerCase();
        if (suffix.equals(".jpg") || suffix.equals(".jpeg") || suffix.equals(".png")/* || suffix.equals(".gif")*/) {
            /*  fileName = UUID.randomUUID().toString()+suffix;*/
            File targetFile = new File(path,  fileName);
            if (!targetFile.getParentFile().exists()) {    //注意，判断父级路径是否存在
                targetFile.getParentFile().mkdirs();
            }
            long size = 0;
            //保存
            try {
                file.transferTo(targetFile);
                size = file.getSize();
            } catch (Exception e) {
                e.printStackTrace();
                return R.error("上传失败！");
            }
        }
        System.out.print("上传图片" + fileName);
        return R.ok().put("info", "上传成功");
    }
}
