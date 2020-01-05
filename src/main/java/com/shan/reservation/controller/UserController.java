package com.shan.reservation.controller;

import com.shan.reservation.bean.user;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.gabe.mychat.controller
 * @Description:
 * @date 2019年12月30日 19:28:12
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/test" )
    public R updateImg(@RequestBody Map<String,String> map){
            int id=Integer.parseInt(map.get("id"));
            user user=userService.selectUserById(id);
            return R.ok().put("user",user);

    }
    @ResponseBody
    @RequestMapping("/Login" )
    public R Login(@RequestBody Map<String,String> map,HttpSession httpSession){
        String name=map.get("name");
        String password=map.get("password");
        user user=userService.selectUserByNickName(name);
        if(user!=null){
           if(user.getUserPassword().equals(password)){
//               httpSession.setAttribute("user",user);
               return  R.ok().put("user",user);
           }
        }
        return  R.error();
    }

}
