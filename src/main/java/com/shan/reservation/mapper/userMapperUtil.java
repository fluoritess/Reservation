package com.shan.reservation.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface userMapperUtil {
    void updateByName(String userName, Date lastDate);
}
