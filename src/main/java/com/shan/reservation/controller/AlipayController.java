package com.shan.reservation.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.shan.reservation.bean.cartutil;
import com.shan.reservation.bean.order;
import com.shan.reservation.bean.user;
import com.shan.reservation.mapper.userMapper;
import com.shan.reservation.service.AlipayService;
import com.shan.reservation.service.OrderService;
import com.shan.reservation.service.UserService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author wsw
 * @Package com.shan.reservation.controller
 * @Description:支付controller
 * @date 2020年2月9日 15:41:27
 */
@Controller
@RequestMapping("/Alipay" )
public class AlipayController {
    @Autowired
    OrderService orderService;
    @Autowired
    userMapper userMapper;
    @Autowired
    @Qualifier("alipayService")
    private AlipayService alipayService;

    /**
     * web 订单支付  报废
     */
    @GetMapping("getPagePay")
    public Map<Object, Object> getPagePay() {
        /** 模仿数据库，从后台调数据*/
        String outTradeNo = "19960310621211";
        BigDecimal totalAmount =new BigDecimal("1.22");
        String subject = "苹果28";

        String pay = null;
        try {
            pay = alipayService.webPagePay(outTradeNo, totalAmount, subject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pay);

        Map<Object, Object> pays = new HashMap<>();
        pays.put("pay", pay);

        return pays;
    }
    //报废
    @ResponseBody
    @RequestMapping("/getPagePay2" )
    @ArchivesLog(operationType = "用户操作", operationName = "付款")
    public R getPagePay2( @RequestBody Map<String,String> map,HttpSession httpSession){
        System.out.print("调用支付接口");
        //获取订单基本信息
        String orderNo_user=map.get("userId");
        Integer user_id=Integer.parseInt(map.get("userId"));
        user user=userMapper.selectByPrimaryKey(user_id);
        String user_name=user.getUserName();
        Integer res_id=9;
       String price2= map.get("price");
        BigDecimal price=new BigDecimal(price2);
        Date date=new Date();
        Byte state=0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String orderNo_date = sdf.format(date);
        String orderNo=orderNo_date+orderNo_user;
        order order=new order(orderNo,user_id,res_id,price,date,state);
        //创建订单
        orderService.addOrder(order);
        String outTradeNo = orderNo;
        Integer totalAmount = 1;
        String subject = user_name+"先生";
        String pay = null;
        try {
            pay = alipayService.webPagePay(outTradeNo, price, subject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pay);

        Map<Object, Object> pays = new HashMap<>();
        pays.put("pay", pay);

        return R.ok().put("pays",pays);
    }
    //使用这个接口
    @ResponseBody
    @RequestMapping("/getPagePay3" )
    @ArchivesLog(operationType = "用户操作", operationName = "付款")
    public R getPagePay3( @RequestBody Map<String,String> map,HttpSession httpSession){
        System.out.print("调用支付接口");
        //获取订单基本信息
        String orderNo_user=map.get("userId");
        Integer user_id=Integer.parseInt(map.get("userId"));
        user user=userMapper.selectByPrimaryKey(user_id);
        String user_name=user.getUserName();
        String orderNo=map.get("orderNo");
        String price2= map.get("price");
        BigDecimal price=new BigDecimal(price2);

        //修改订单
        orderService.uodateByNo1(orderNo);
        String outTradeNo = orderNo;
        Integer totalAmount = 1;
        String subject = user_name+"先生";
        String pay = null;
        try {
            pay = alipayService.webPagePay(outTradeNo, price, subject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pay);

        Map<Object, Object> pays = new HashMap<>();
        pays.put("pay", pay);

        return R.ok().put("pays",pays);
    }

    /**
     * app 订单支付
     */
    @GetMapping("getAppPagePay")
    public R getAppPagePay() throws Exception{
        /** 模仿数据库，从后台调数据*/
        String outTradeNo = "131233";
        BigDecimal totalAmount =new BigDecimal("1000")  ;
        String subject = "天猫超市012";

        String pay = alipayService.appPagePay(outTradeNo, totalAmount, subject);

        Object json = JSONObject.toJSON(pay);

        System.out.println(json);

        return R.ok().put("json",json);
    }

//    /**
//     * 交易查询
//     */
//    @PostMapping("aipayQuery")
//    public ResultBO<?> alipayQuery() throws Exception{
//        /**调取支付订单号*/
//        String outTradeNo = "13123";
//
//        String query = alipayService.query(outTradeNo);
//
//        Object json = JSONObject.toJSON(query);
//
//        /*JSONObject jObject = new JSONObject();
//        jObject.get(query);*/
//        return ResultTool.success(json);
//    }

//    /**
//     * 退款
//     * @throws AlipayApiException
//     */
//    @GetMapping("alipayRefund")
//    public ResultBO<?> alipayRefund(
//            @RequestParam("outTradeNo")String outTradeNo,
//            @RequestParam(value = "outRequestNo", required = false)String outRequestNo,
//            @RequestParam(value = "refundAmount", required = false)Integer refundAmount
//    ) throws AlipayApiException{
//
//        /** 调取数据*/
//        //String outTradeNo = "15382028806591197";
//        String refundReason = "用户不想购买";
//        //refundAmount = 1;
//        //outRequestNo = "22";
//
//        String refund = alipayService.refund(outTradeNo, refundReason, refundAmount, outRequestNo);
//
//        System.out.println(refund);
//
//        return ResultTool.success(refund);
//    }
//
//    /**
//     * 退款查询
//     * @throws AlipayApiException
//     */
//    @PostMapping("refundQuery")
//    public ResultBO<?> refundQuery() throws AlipayApiException{
//
//        /** 调取数据*/
//        String outTradeNo = "13123";
//        String outRequestNo = "2";
//
//        String refund = alipayService.refundQuery(outTradeNo, outRequestNo);
//
//        return ResultTool.success(refund);
//
//    }
//
//    /**
//     * 交易关闭
//     * @throws AlipayApiException
//     */
//    @PostMapping("alipayclose")
//    public ResultBO<?> alipaycolse() throws AlipayApiException {
//
//        /** 调取数据*/
//        String outTradeNo = "13123";
//
//        String close = alipayService.close(outTradeNo);
//
//        return ResultTool.success(close);
//    }

}

