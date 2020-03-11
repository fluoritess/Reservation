package com.shan.reservation.controller;

import com.shan.reservation.bean.admin;
import com.shan.reservation.bean.advertisement;
import com.shan.reservation.mapper.advertisementMapper;
import com.shan.reservation.mapper.advertisementUtilMapper;
import com.shan.reservation.service.AdminService;
import com.shan.reservation.service.AlipayService;
import com.shan.reservation.service.advertisementService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
    @Autowired
    advertisementMapper advertisementMapper;
    @Autowired
    advertisementUtilMapper advertisementUtilMapper;
    @Autowired
    @Qualifier("alipayService")
    private AlipayService alipayService;
    @ResponseBody
    @RequestMapping("/resTaurantSelectAdvertise" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询广告信息")
    public R resTaurantSelectAdvertise(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer re_id=Integer.parseInt(map.get("re_id"));
        List<advertisement> list= advertisementService.resTaurantSelectAdvertise(re_id);
        return  R.ok().put("advertisement",list);
    }
    @ResponseBody
    @RequestMapping("/selectAllAdvertisement" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询所有广告信息")
    public R selectAllAdvertisement(@RequestBody Map<String,String> map, HttpSession httpSession){
        List<advertisement> list= advertisementMapper.selectByExample(null);
        return  R.ok().put("advertisement",list);
    }
    @ResponseBody
    @RequestMapping("/AddAdvertisement" )
    @ArchivesLog(operationType = "添加信息", operationName = "添加广告")
    public R AddAdvertisement(@RequestBody Map<String,String> map, HttpSession httpSession){
        String start=map.get("start");
        String end=map.get("end");
        String tital=map.get("tital");
        String content=map.get("content");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startTime = null;
        Date endTime = null;
        try {
            startTime = simpleDateFormat.parse(start);
            endTime=simpleDateFormat.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Integer re_id=Integer.parseInt(map.get("re_id"));
        advertisement advertisement=new advertisement(tital,content,re_id,startTime,endTime,0);
        advertisementMapper.insert(advertisement);
        String restaurant=map.get("restaurant");
        BigDecimal price=new BigDecimal(5000);
        String pay = null;
        try {
            pay = alipayService.webPagePayAd(tital, price, restaurant);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<Object, Object> pays = new HashMap<>();
        pays.put("pay", pay);

        return  R.ok().put("pays",pays);
    }

}
