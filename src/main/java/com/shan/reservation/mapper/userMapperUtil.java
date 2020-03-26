package com.shan.reservation.mapper;

import com.shan.reservation.bean.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface userMapperUtil {
    void updateByName(String userName,Date lastDate, Date thisDate);
    int SetUserState0(String realName);
    int SetUserState1(String realName);
    user selectLastDate(String userName);
    int insert(user user);
}
