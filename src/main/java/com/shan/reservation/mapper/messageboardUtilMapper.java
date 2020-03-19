package com.shan.reservation.mapper;

import com.shan.reservation.bean.messageboard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface messageboardUtilMapper {
    List<messageboard> selectMessageByRe(int restaurantId);
    int insert(int userId,int restaurantId,String content);
}
