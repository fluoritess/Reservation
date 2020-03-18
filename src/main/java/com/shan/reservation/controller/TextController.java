package com.shan.reservation.controller;

import com.shan.reservation.bean.user;
import com.shan.reservation.util.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author wsw
 * @Package com.shan.reservation.controller
 * @Description:测试controller
 * @date 2020年2月8日 13:45:57
 */
@Controller
public class TextController {
    @ResponseBody
    @RequestMapping("/test" )
    public R updateImg(@RequestBody Map<String,String> map){
        System.out.print(map);
        return R.ok();

    }
}
