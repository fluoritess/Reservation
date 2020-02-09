package com.shan.reservation.controller;

import com.shan.reservation.bean.order;
import com.shan.reservation.service.OrderService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
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
 * @Description:支付controller
 * @date 2020年2月9日 15:41:27
 */
@Controller
public class PayController {
    @ResponseBody
    @RequestMapping("/pay" )
    @ArchivesLog(operationType = "用户操作", operationName = "支付订单")
    public R pay(@RequestBody Map<String,String> map, HttpSession httpSession){

        return  R.ok();
    }
}
