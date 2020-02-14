package com.shan.reservation.controller;

import com.shan.reservation.bean.address;
import com.shan.reservation.bean.admin;
import com.shan.reservation.mapper.addressMapper;
import com.shan.reservation.service.AdminService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author wsw
 * @Package com.gabe.mychat.controller
 * @Description:管理员controller
 * @date 2020年2月2日 17:06:30
 */
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @ResponseBody
    @RequestMapping("/SelectAdminByName" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询管理员")
    public R SelectAdminByName(@RequestBody Map<String,String> map, HttpSession httpSession){
       String admin_name=map.get("adminName");
        admin admin=adminService.SelectAdminByName(admin_name);
        return  R.ok().put("address",admin);
    }
    @ResponseBody
    @RequestMapping("/AdminLogin" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询管理员")
    public R AdminLogin(@RequestBody Map<String,String> map, HttpSession httpSession){
        String admin_name=map.get("adminName");
        String passowrd=map.get("password");
        admin admin=adminService.SelectAdminByName(admin_name);
        if(admin!=null){
            if(admin.getAdminPassword().equals(passowrd)){
                System.out.print("管理员登陆成功");
                return  R.ok().put("admin",admin);
            };
        }
        return  R.ok();
    }
}
