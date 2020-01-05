package com.shan.reservation.util;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import java.lang.annotation.*;

/**
 * @author wsw
 * @Package com.gabe.mychat
 * @Description:
 * @date 2019年12月30日 19:25:40
 */

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArchivesLog {
    /** 要执行的操作类型比如：add操作 **/

    String operationType() default "";

    /** 要执行的具体操作比如：添加用户 **/

    String operationName() default "";
}
