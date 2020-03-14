package com.shan.reservation.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface userMapperUtil {
    void updateByName(String userName, Date lastDate);
    int SetUserState0(String realName);
    int SetUserState1(String realName);
}
