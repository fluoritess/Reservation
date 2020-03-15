package com.shan.reservation.util;

import java.util.Date;
/**
 * @author wsw
 * @Package
 * @Description:计算日期
 * @date 2020年3月15日 20:34:43
 */
public class date {
    public static long daysBetween(Date one, Date two) {
        long difference =  (one.getTime()-two.getTime())/86400000;
        return Math.abs(difference);
    }
}
