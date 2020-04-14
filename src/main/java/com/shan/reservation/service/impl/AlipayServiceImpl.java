package com.shan.reservation.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.*;
import com.shan.reservation.config.AlipayConfig;
import com.shan.reservation.service.AlipayService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 支付实现类
 * @author lcc
 * @data :2018年6月4日 上午10:18:07
 */
@Service("alipayService")
public class AlipayServiceImpl implements AlipayService {

    /** 调取支付宝接口 web端支付*/
    DefaultAlipayClient alipayClient = new DefaultAlipayClient(
            AlipayConfig.GATEWAYURL, AlipayConfig.APP_ID, AlipayConfig.MERCHANT_PRIVATE_KEY, "json", AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGN_TYPE);

    /** 调取支付宝接口app端支付*/
    AlipayClient alipayClients = new DefaultAlipayClient(
            AlipayConfig.GATEWAYURL, AlipayConfig.APP_ID, AlipayConfig.MERCHANT_PRIVATE_KEY, "json", AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGN_TYPE);


    @Override
    public String webPagePay(String outTradeNo, BigDecimal totalAmount, String subject) throws Exception {

        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        /** 同步通知，支付完成后，支付成功页面*/
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        /** 异步通知，支付完成后，需要进行的异步处理*/
        alipayRequest.setNotifyUrl(AlipayConfig.test_url);

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ outTradeNo +"\","
                + "\"total_amount\":\""+ totalAmount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\"商品名称\","
                + "\"timeout_express\":\"90m\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        /**转换格式*/
        String result = alipayClient.pageExecute(alipayRequest).getBody().replace('\"','\'').replace('\n',' ');
        return result;
    }
    //广告付费
    @Override
    public String webPagePayAd(String outTradeNo, BigDecimal totalAmount, String subject) throws Exception {
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        /** 同步通知，支付完成后，支付成功页面*/
        alipayRequest.setReturnUrl(AlipayConfig.return_shopurl);
        /** 异步通知，支付完成后，需要进行的异步处理*/
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ outTradeNo +"\","
                + "\"total_amount\":\""+ totalAmount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\"商品名称\","
                + "\"timeout_express\":\"90m\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        /**转换格式*/
        String result = alipayClient.pageExecute(alipayRequest).getBody().replace('\"','\'').replace('\n',' ');
        return result;
    }

    @Override
    public String refund(String outTradeNo,String refundReason,Integer refundAmount,String outRequestNo) throws AlipayApiException {
        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();

        /** 调取接口*/
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ outTradeNo +"\","
                + "\"refund_amount\":\""+ refundAmount +"\","
                + "\"refund_reason\":\""+ refundReason +"\","
                + "\"out_request_no\":\""+ outRequestNo +"\"}");
        String result = alipayClient.execute(alipayRequest).getBody();
        return result;
    }

    @Override
    public String query(String outTradeNo) throws AlipayApiException {
        AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest();
        /**请求接口*/
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ outTradeNo +"\","+"\"trade_no\":\""+ "" +"\"}");
        /**转换格式*/
        String result = alipayClient.execute(alipayRequest).getBody();
        return result;
    }

    @Override
    public String close(String outTradeNo) throws AlipayApiException {
        AlipayTradeCloseRequest alipayRequest = new AlipayTradeCloseRequest();

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ outTradeNo +"\"," +"\"trade_no\":\""+ "" +"\"}");

        String result = alipayClient.execute(alipayRequest).getBody();

        return result;
    }

    @Override
    public String refundQuery(String outTradeNo , String outRequestNo) throws AlipayApiException {
        AlipayTradeFastpayRefundQueryRequest alipayRequest = new AlipayTradeFastpayRefundQueryRequest();

        /** 请求接口*/
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ outTradeNo +"\","
                +"\"out_request_no\":\""+ outRequestNo +"\"}");

        /** 格式转换*/
        String result = alipayClient.execute(alipayRequest).getBody();

        return result;
    }

    @Override
    public String appPagePay(String outTradeNo, BigDecimal totalAmount, String subject) throws Exception {
        AlipayTradeWapPayRequest alipayRequest=new AlipayTradeWapPayRequest();

        /** 同步通知，支付完成后，支付成功页面*/
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        /** 异步通知，支付完成后，需要进行的异步处理*/
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        /**销售产品码（固定）*/
        String productCode="QUICK_WAP_WAY";

        /** 进行赋值 */
        AlipayTradeWapPayModel wapPayModel=new AlipayTradeWapPayModel();
        wapPayModel.setOutTradeNo(outTradeNo);
        wapPayModel.setSubject(subject);
        wapPayModel.setTotalAmount(totalAmount.toString());
        wapPayModel.setBody("商品名称");
        wapPayModel.setTimeoutExpress("2m");
        wapPayModel.setProductCode(productCode);
        alipayRequest.setBizModel(wapPayModel);

        /** 格式转换*/
        String result = alipayClients.pageExecute(alipayRequest).getBody().replace('\"','\'').replace('\n',' ');
        return result;
    }

}
