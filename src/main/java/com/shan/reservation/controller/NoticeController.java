package com.shan.reservation.controller;

import com.shan.reservation.bean.admin;
import com.shan.reservation.bean.notice;
import com.shan.reservation.bean.order;
import com.shan.reservation.mapper.adminMapper;
import com.shan.reservation.service.NoticeService;
import com.shan.reservation.service.OrderService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import com.shan.reservation.util.date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Date;
/**
 * @author wsw
 * @Package com.shan.reservation.controller
 * @Description:新闻controller
 * @date 2020年2月8日 14:54:32
 */
@Controller
public class NoticeController {
    @Autowired
    NoticeService NoticeService;
    @Autowired
    adminMapper adminMapper;
    @ResponseBody
    @RequestMapping("/selectNoticeByName" )
    @ArchivesLog(operationType = "查询信息", operationName = "按名称查询新闻")
    public R selectNoticeByName(@RequestBody Map<String,String> map, HttpSession httpSession){
        String title=map.get("title");
//        String title="网络订餐全程监管 维护消费者“舌尖上的安全”";
        notice notice=NoticeService.selectNoticeByName(title);
        return  R.ok().put("notice",notice);
    }
    @ResponseBody
    @RequestMapping("/selectNoticeLast" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询最新新闻")
    public R selectNoticeLast(HttpSession httpSession){
        List<notice> notice=NoticeService.selectNoticeLast();
        return  R.ok().put("notice",notice);
    }
    @ResponseBody
    @RequestMapping("/selectNoticeById" )
    @ArchivesLog(operationType = "查询信息", operationName = "按id查询新闻")
    public R selectNoticeById(@RequestBody Map<String,String> map, HttpSession httpSession){
        int noticeId=Integer.parseInt(map.get("noticeId"));
        notice notice=NoticeService.selectById(noticeId);
        return  R.ok().put("notice",notice);
    }
    @ResponseBody
    @RequestMapping("/addNotice" )
    @ArchivesLog(operationType = "添加信息", operationName = "添加告示/新闻")
    public R addNotice(@RequestBody Map<String,String> map, HttpSession httpSession){
      String title=map.get("title");
      String content=map.get("content");
      String admin=map.get("admin");
      int adminId=0;
      List<admin> admin1= adminMapper.selectByExample(null);
      for(admin admin2:admin1){
          String adminNmae=admin2.getAdminName();
          if(adminNmae.equals(admin)){
               adminId=admin2.getAdminId();
          }
      }
      Date date=new Date();
      notice notice=new notice(adminId,title,content,date);
        NoticeService.addNotice(notice);
        return  R.ok().put("notice",notice);
    }
}
