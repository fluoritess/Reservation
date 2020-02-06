package com.shan.reservation.mapper;

import com.shan.reservation.bean.food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface foodUtilMapper {
    List<food> selectByName(String foodName);
}
