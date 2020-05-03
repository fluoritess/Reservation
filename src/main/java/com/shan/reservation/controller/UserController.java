package com.shan.reservation.controller;

import com.shan.reservation.bean.address;
import com.shan.reservation.bean.user;
import com.shan.reservation.service.AddressService;
import com.shan.reservation.service.OrderService;
import com.shan.reservation.service.UserService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.shan.reservation.controller
 * @Description:用户controller
 * @date 2019年12月30日 19:28:12
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AddressService addressService;
    @Autowired
    OrderService OrderService;
    @ResponseBody
    @RequestMapping("/Login" )
    @ArchivesLog(operationType = "用户操作", operationName = "用户登陆")
    public R Login(@RequestBody Map<String,String> map,HttpSession httpSession){
        String name=map.get("name");
        String password=map.get("password");
        user user=userService.selectUserByNickName(name);
//        &&user.getUserState()!=0
        if(user!=null){
           if(user.getUserPassword().equals(password)){
//               httpSession.setAttribute("user",user);
               Date date=new Date();
               System.out.print(date);
               user user_=userService.selectLastDate(name);
               Date lastDate=user_.getLastDate();
               userService.updateByName(name,lastDate,date);
               return  R.ok().put("user",user);
           }
        }
        return  R.error();
    }
    @ResponseBody
    @RequestMapping("/GetUserCityInfo" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据用户name查询用户所属区")
    public R GetUserCityInfo(@RequestBody Map<String,String> map,HttpSession httpSession){
        String name=map.get("name");
        user user=userService.selectUserByNickName(name);
        if(user!=null){
            int addressId=user.getUserId();
            address address=addressService.getAddressInfo(addressId);
            String city=address.getAddressCity();
            String distinct=address.getAddressDistrict();
            Map info=new HashMap();
            info.put("city",city);
            info.put("distict",distinct);
            return  R.ok().put("user",info);
        }
        return  R.error();
    }
    @ResponseBody
    @RequestMapping("/GetUserInfo" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据用户name查询用户信息")
    public R GetUserInfo(@RequestBody Map<String,String> map,HttpSession httpSession){
        String name=map.get("name");
        user user=userService.selectUserByNickName(name);
        return  R.ok().put("user",user);
    }
    @ResponseBody
    @RequestMapping("/selectAllUser" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询所有用户")
    public R selectAllUser(HttpSession httpSession){
        List<user> list=userService.selectAllUser();
        return  R.ok().put("user",list);
    }
    @ResponseBody
    @RequestMapping("/UserEvaluation" )
    @ArchivesLog(operationType = "添加信息", operationName = "评价")
    public R UserEvaluation(@RequestBody Map<String,String> map,HttpSession httpSession){
        String no=map.get("no");
        String content=map.get("content");
        double score=Double.parseDouble(map.get("score"));
        userService.UserEvaluation(no,score,content);
        OrderService.uodateByNo4(no);
        return  R.ok();
    }
    @ResponseBody
    @RequestMapping("/getCode" )
    @ArchivesLog(operationType = "用户操作", operationName = "获取验证码")
    public R getCode(HttpSession httpSession){
        String code=com.shan.reservation.util.code.getCode();
        System.out.print(code);
        httpSession.setAttribute("code",code);
        return  R.ok();
    }
    @ResponseBody
    @RequestMapping("/userRegister" )
    @ArchivesLog(operationType = "用户操作", operationName = "用户注册")
    public R userRegister(@RequestBody Map<String,String> map,HttpSession httpSession){
        String code=map.get("code");
        String password=map.get("password");
        String name=map.get("name");
        String phone=map.get("phone");
        String realName="匿名";
        String code1=(String)httpSession.getAttribute("code");
        if(code.equals(code1)){
            List<user> list=userService.selectAllUser();
            int id=list.size()+1;
            user user=new user(id,password,phone,realName,name,1);
            int flag=userService.register(user);
            if(flag==1){
                return  R.ok();
            }
        }
        return R.error();
    }
    @ResponseBody
    @RequestMapping("/Test" )
    @ArchivesLog(operationType = "测试", operationName = "测试")
    public R Test(HttpSession httpSession){
        System.out.print("xxxxxxxxx");
        return  R.error();
    }
}
