package com.shan.reservation.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String APP_ID = "2016102000728040";

    // 商户私钥，您的PKCS8格式RSA2私钥，这些就是我们刚才设置的
    public static String MERCHANT_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC+DV7kOFkoyEPRr+4gG3Qo6U2EI980bV9MWolaZ8F6W6jwS9YKp0UJ/gXGqr59v/A7su1wKckLrsxhFFrBlvF0f9L1Ij/FSDrPxegZ5BZwJM3KRpTJ23QsBqvpdXZyZdwx9o9IewRSOPfzztWP8PMoLEcpdOlFucdZ2Vcfjiz1FjmQJ1RTu0JW+SBFBAipfVpXzjM8WPTB4Boa8WGBhtNvzOqe5shdZO9f0gztUU8/ghbb6ibjX139pBe9RB4QColY8nnV6JvsaA88YZmLzXBCYu4rria1VjLOdht7wLwZWJLS+dY2UopVUE1R5INRZN6zKI14mI24ZlZRZgmfEMTJAgMBAAECggEACIXa+osYXH7Wo8GrAR+aDvefdUyShuxcuLTasgYzJASWR+huud2UeAU/RxCDKGqCIHs+sKf/DxoQqk3aYBIf0+SjlkCp8XPyxzyN0xNqei78V5TguUixJgRKk1akMC8nN8ph1JNHt1Q8sl9VLnZUwTlzG4XVrD3PldTsVkru8zKu+dE0pRjzijWh1TWucvWECF9Ud9N7BXgBHY48t90jENPCfHG5uJJBeXtKpTFVn55D2qqZgYSt0B9etJWeCxWJgEQoOqNdARJGyyDlEFdGTc7AIhfo2JNZtEF9VzlWm2erW8h42U1V+fxOa6JlaOgvvLyjrJc0x99IQNFedb8isQKBgQD9uxgI+2RZA8ECYAQnTcQEqIV/uvJkohsocetC7uurcgFYX3aKlbeihkGwSkSbCAf4rVZh8Dwxj0+ES8pthLROo8u05JKd3ds7y4ib9B8BfKuqhayYUBlX51OKBwoT+TlqzmzvM8tOuaYKhx6jsImZbW0BgFAbm4uZLyh3i/QfPQKBgQC/wHy+jtCgwMgYxOZ5vD0f3SgNCQbZNYsORNK0NZdUavPJR7HnWLU5A06sjn6nEWwNjQvIxacboxmIu79RihEaweYB7wUENBFS1t/EmwyJVP96n/39f5z+ec1T/DBbPA7jbVoQwKlENBLAOkhaKG0dTFHablHoZMwYJjFwWuvUfQKBgCMcedX8W8WJpHLcsJZzx3VRkK+9Qf+1AwcUxJaNk2U1MIR3KWNCFphR9dMcY+QEN34tFnAVG29MQpevGUMQgxcCyZStsLBR3B2pK61RGd1N0D+Xoeut4ePtKf1GvhlHeq+SAzcStsadICIC0rWaH2Bw6Q21IODBJI89HF92qYCNAoGBAJOfxqoSW04XfTWMiX/ZSxm38viuJWaeUTMoCyuQQrRMLumcV7urUMHW6P/yKFHJGO4J07O7b57YX3UkTfOhnu+Brel5Mdx9lYS4RsgfMnScSqAGgs1iLOTBszFga34h67ht3LQfD3GhwXnapQ88Jl0y/6Vx339R8sr4xIEijoMlAoGAKOG/BOipsRmCitYakFV+FQgB421cHtGR7N4I45x1lG26d5opklYOw/oaf/YkeA4Xr9wEwUHygylM3/u2KZ7obM8MFAzRC+3aYurAp2FMRCudH7XggF9Ar4AOB1xlzHZ5e0p8o/m3Edf2fsdw3r72vnmvARDRxN50RBLzAyxkz9s=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。，这些就是我们刚才设置的
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvg1e5DhZKMhD0a/uIBt0KOlNhCPfNG1fTFqJWmfBeluo8EvWCqdFCf4Fxqq+fb/wO7LtcCnJC67MYRRawZbxdH/S9SI/xUg6z8XoGeQWcCTNykaUydt0LAar6XV2cmXcMfaPSHsEUjj3887Vj/DzKCxHKXTpRbnHWdlXH44s9RY5kCdUU7tCVvkgRQQIqX1aV84zPFj0weAaGvFhgYbTb8zqnubIXWTvX9IM7VFPP4IW2+om419d/aQXvUQeEAqJWPJ51eib7GgPPGGZi81wQmLuK64mtVYyznYbe8C8GViS0vnWNlKKVVBNUeSDUWTesyiNeJiNuGZWUWYJnxDEyQIDAQAB";

    //异步通知，再这里我们设计自己的后台代码
    public static String notify_url = "http://localhost:8080/user_orderlist.html";
    //异步通知，再这里我们设计自己的后台代码
    public static String test_url = "http://localhost:8080/Test";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/user_orderlist.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_shopurl = "http://localhost:8080/shophoutai/html/main.html";
    // 签名方式
    public static String SIGN_TYPE = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关
    public static String GATEWAYURL = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String LOG_PATH = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(LOG_PATH + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
