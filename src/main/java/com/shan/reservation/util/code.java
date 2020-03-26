package com.shan.reservation.util;

import java.security.SecureRandom;
import java.util.Random;
/**
 * @author wsw
 * @Package
 * @Description:验证码
 * @date 2020年3月26日 19:15:24
 */
public class code {
    public static String getCode(){
        String str="0123456789";
        String code=new String();
        for(int i=0;i<4;i++)
        {
            char ch=str.charAt(new Random().nextInt(str.length()));
            code+=ch;
        }
        return code;
    }
}
