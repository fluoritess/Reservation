package com.shan.reservation.controller;

import com.shan.reservation.bean.food;
import com.shan.reservation.bean.order;
import com.shan.reservation.bean.user;
import com.shan.reservation.mapper.orderUtilMapper;
import com.shan.reservation.mapper.userMapper;
import com.shan.reservation.service.FoodService;
import com.shan.reservation.service.OrderService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author wsw
 * @Package com.gabe.mychat.controller
 * @Description:订单controller
 * @date 2020年1月14日 18:38:51
 */
@Controller
public class OrderController {
    @Autowired
    OrderService OrderService;
    @Autowired
    userMapper userMapper;
    @ResponseBody
    @RequestMapping("/selectOrderByUserId" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询用户订单信息")
    public R selectOrderByUserId(@RequestBody Map<String,String> map, HttpSession httpSession){
        int userId=Integer.parseInt(map.get("userId"));
        List<order> list=OrderService.selectByUserId(userId);
        return  R.ok().put("order",list);
    }
    @ResponseBody
    @RequestMapping("/deleteOrderByNo" )
    @ArchivesLog(operationType = "删除信息", operationName = "删除订单")
    public R deleteOrderByNo(@RequestBody Map<String,String> map, HttpSession httpSession){
        String orderNo=map.get("orderno");
        OrderService.deleteByNo(orderNo);
        return  R.ok();
    }
    @ResponseBody
    @RequestMapping("/deleteOrderByNo2" )
    @ArchivesLog(operationType = "删除信息", operationName = "删除订单")
    public R deleteOrderByNo2(@RequestBody Map<String,String> map, HttpSession httpSession){
        String orderNo=map.get("orderno");
        OrderService.deleteByNo2(orderNo);
        return  R.ok();
    }
    @ResponseBody
    @RequestMapping("/AddOrder" )
    @ArchivesLog(operationType = "添加信息", operationName = "创建订单")
    public R AddOrder(@RequestBody Map<String,String> map, HttpSession httpSession){
        //获取订单基本信息
        String orderNo_user=map.get("userId");
        Integer user_id=Integer.parseInt(map.get("userId"));
        user user= userMapper.selectByPrimaryKey(user_id);
        Integer address_id=Integer.parseInt(map.get("addressId"));
        String user_name=user.getUserName();
        Integer res_id=9;
        String price2= map.get("price");
        BigDecimal price=new BigDecimal(price2);
        Date date=new Date();
        Byte state=0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String orderNo_date = sdf.format(date);
        String orderNo=orderNo_date+orderNo_user;
        order order=new order(orderNo,user_id,res_id,price,date,state,address_id);
        //创建订单
        OrderService.addOrder(order);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/selectOrder" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据编号查询订单")
    public R selectOrder(@RequestBody Map<String,String> map, HttpSession httpSession){
        String orderNo=map.get("orderNo");
        order order=OrderService.selectOrder(orderNo);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/ResSelectOrder" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询订单")
    public R ResSelectOrder(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.ResSelectOrder(restaurantid);
        List tarlist=new ArrayList();
        Iterator it=order.iterator();
        while(it.hasNext()){
            Map tarmap=new HashMap();
            order order1=(order)it.next();
            String orderno=order1.getOrderno();
            BigDecimal price=order1.getPrice();
            int user=order1.getUserid();
            user user1=userMapper.selectByPrimaryKey(user);
            String nickName=user1.getUserName();
            String userName=user1.getRealname();
            String userPhone=user1.getUserPhone();
            Date createtime=order1.getCreatetime();
            Byte orderstate=order1.getOrderstate();
            tarmap.put("orderno",orderno);
            tarmap.put("price",price);
            tarmap.put("userName",userName);
            tarmap.put("nickName",nickName);
            tarmap.put("userPhone",userPhone);
            tarmap.put("createtime",createtime);
            tarmap.put("orderstate",orderstate);
            tarlist.add(tarmap);
        }
        return R.ok().put("order",tarlist);
    }
    @ResponseBody
    @RequestMapping("/OrderLimitOneDay" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一天内订单")
    public R OrderLimitOneDay(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderLimitOneDay(restaurantid);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/OrderLimitOneWeek" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一周内订单")
    public R OrderLimitOneWeek(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderLimitOneWeek(restaurantid);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/OrderLimitOneMonth" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一月内订单")
    public R OrderLimitOneMonth(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderLimitOneMonth(restaurantid);
        return R.ok().put("order",order);
    }

    @ResponseBody
    @RequestMapping("/OrderState1" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询未出货订单")
    public R OrderState1(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderState1(restaurantid);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/OrderState3")
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询未评价订单")
    public R OrderState3(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderState3(restaurantid);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/OrderState5" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询退后申请订单")
    public R OrderState5(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderState5(restaurantid);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/updateState2" )
    @ArchivesLog(operationType = "更新信息", operationName = "商家发货")
    public R updateState2(@RequestBody Map<String,String> map, HttpSession httpSession){
       String orderNo=map.get("orderNo");
        OrderService.updateState2(orderNo);
        return R.ok();
    }
    @ResponseBody
    @RequestMapping("/SalePriceOneDay" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一天销售额")
    public R SalePriceOneDay(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        BigDecimal price=OrderService.SalePriceOneDay(restaurantid);
        return R.ok().put("price",price);
    }
    @ResponseBody
    @RequestMapping("/SalePriceOneWeek" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一周销售额")
    public R SalePriceOneWeek(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        BigDecimal price=OrderService.SalePriceOneWeek(restaurantid);
        return R.ok().put("price",price);
    }
    @ResponseBody
    @RequestMapping("/SalePriceOneMonth" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一月销售额")
    public R SalePriceOneMonth(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        BigDecimal price=OrderService.SalePriceOneMonth(restaurantid);
        return R.ok().put("price",price);
    }
    @ResponseBody
    @RequestMapping("/OrderState6OneDay" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一天内退货订单")
    public R OrderState6OneDay(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderState6OneDay(restaurantid);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/OrderState6OneWeek" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一周内退货订单")
    public R OrderState6OneWeek(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderState6OneWeek(restaurantid);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/OrderState6OneMonth" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家一月内退货订单")
    public R OrderState6OneMonth(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        List<order> order=OrderService.OrderState6OneMonth(restaurantid);
        return R.ok().put("order",order);
    }
    @ResponseBody
    @RequestMapping("/OrderState6OneDayPrice" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一天内退货订单价钱")
    public R OrderState6OneDayPrice(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        BigDecimal price=OrderService.OrderState6OneDayPrice(restaurantid);
        return R.ok().put("price",price);
    }
    @ResponseBody
    @RequestMapping("/OrderState6OneWeekPrice" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一周内退货订单价钱")
    public R OrderState6OneWeekPrice(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        BigDecimal price=OrderService.OrderState6OneWeekPrice(restaurantid);
        return R.ok().put("price",price);
    }
    @ResponseBody
    @RequestMapping("/OrderState6OneMonthPrice" )
    @ArchivesLog(operationType = "查询信息", operationName = "商家查询一月内退货订单价钱")
    public R OrderState6OneMonthPrice(@RequestBody Map<String,String> map, HttpSession httpSession){
        Integer restaurantid=Integer.parseInt(map.get("restaurantid"));
        BigDecimal price=OrderService.OrderState6OneMonthPrice(restaurantid);
        return R.ok().put("price",price);
    }
}
