package com.shan.reservation.util;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] src){
//        //实例化客户端
//        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", "\t\n" +
//                "2016102000728040", "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC+DV7kOFkoyEPRr+4gG3Qo6U2EI980bV9MWolaZ8F6W6jwS9YKp0UJ/gXGqr59v/A7su1wKckLrsxhFFrBlvF0f9L1Ij/FSDrPxegZ5BZwJM3KRpTJ23QsBqvpdXZyZdwx9o9IewRSOPfzztWP8PMoLEcpdOlFucdZ2Vcfjiz1FjmQJ1RTu0JW+SBFBAipfVpXzjM8WPTB4Boa8WGBhtNvzOqe5shdZO9f0gztUU8/ghbb6ibjX139pBe9RB4QColY8nnV6JvsaA88YZmLzXBCYu4rria1VjLOdht7wLwZWJLS+dY2UopVUE1R5INRZN6zKI14mI24ZlZRZgmfEMTJAgMBAAECggEACIXa+osYXH7Wo8GrAR+aDvefdUyShuxcuLTasgYzJASWR+huud2UeAU/RxCDKGqCIHs+sKf/DxoQqk3aYBIf0+SjlkCp8XPyxzyN0xNqei78V5TguUixJgRKk1akMC8nN8ph1JNHt1Q8sl9VLnZUwTlzG4XVrD3PldTsVkru8zKu+dE0pRjzijWh1TWucvWECF9Ud9N7BXgBHY48t90jENPCfHG5uJJBeXtKpTFVn55D2qqZgYSt0B9etJWeCxWJgEQoOqNdARJGyyDlEFdGTc7AIhfo2JNZtEF9VzlWm2erW8h42U1V+fxOa6JlaOgvvLyjrJc0x99IQNFedb8isQKBgQD9uxgI+2RZA8ECYAQnTcQEqIV/uvJkohsocetC7uurcgFYX3aKlbeihkGwSkSbCAf4rVZh8Dwxj0+ES8pthLROo8u05JKd3ds7y4ib9B8BfKuqhayYUBlX51OKBwoT+TlqzmzvM8tOuaYKhx6jsImZbW0BgFAbm4uZLyh3i/QfPQKBgQC/wHy+jtCgwMgYxOZ5vD0f3SgNCQbZNYsORNK0NZdUavPJR7HnWLU5A06sjn6nEWwNjQvIxacboxmIu79RihEaweYB7wUENBFS1t/EmwyJVP96n/39f5z+ec1T/DBbPA7jbVoQwKlENBLAOkhaKG0dTFHablHoZMwYJjFwWuvUfQKBgCMcedX8W8WJpHLcsJZzx3VRkK+9Qf+1AwcUxJaNk2U1MIR3KWNCFphR9dMcY+QEN34tFnAVG29MQpevGUMQgxcCyZStsLBR3B2pK61RGd1N0D+Xoeut4ePtKf1GvhlHeq+SAzcStsadICIC0rWaH2Bw6Q21IODBJI89HF92qYCNAoGBAJOfxqoSW04XfTWMiX/ZSxm38viuJWaeUTMoCyuQQrRMLumcV7urUMHW6P/yKFHJGO4J07O7b57YX3UkTfOhnu+Brel5Mdx9lYS4RsgfMnScSqAGgs1iLOTBszFga34h67ht3LQfD3GhwXnapQ88Jl0y/6Vx339R8sr4xIEijoMlAoGAKOG/BOipsRmCitYakFV+FQgB421cHtGR7N4I45x1lG26d5opklYOw/oaf/YkeA4Xr9wEwUHygylM3/u2KZ7obM8MFAzRC+3aYurAp2FMRCudH7XggF9Ar4AOB1xlzHZ5e0p8o/m3Edf2fsdw3r72vnmvARDRxN50RBLzAyxkz9s=", "json", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvg1e5DhZKMhD0a/uIBt0KOlNhCPfNG1fTFqJWmfBeluo8EvWCqdFCf4Fxqq+fb/wO7LtcCnJC67MYRRawZbxdH/S9SI/xUg6z8XoGeQWcCTNykaUydt0LAar6XV2cmXcMfaPSHsEUjj3887Vj/DzKCxHKXTpRbnHWdlXH44s9RY5kCdUU7tCVvkgRQQIqX1aV84zPFj0weAaGvFhgYbTb8zqnubIXWTvX9IM7VFPP4IW2+om419d/aQXvUQeEAqJWPJ51eib7GgPPGGZi81wQmLuK64mtVYyznYbe8C8GViS0vnWNlKKVVBNUeSDUWTesyiNeJiNuGZWUWYJnxDEyQIDAQAB", "RSA2");
////实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
//        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
//SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
//        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
//        model.setBody("我是测试数据");
//        model.setSubject("App支付测试Java");
//        model.setOutTradeNo("33");
//        model.setTimeoutExpress("30m");
//        model.setTotalAmount("0.01");
//        model.setProductCode("35");
//        request.setBizModel(model);
//        request.setNotifyUrl("商户外网可以访问的异步地址");
//        try {
//            //这里和普通的接口调用不同，使用的是sdkExecute
//            AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
//            System.out.println(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
//        } catch (AlipayApiException e) {
//            e.printStackTrace();
//        }
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String s = sdf.format(d);
        System.out.println(s);
    }
}
