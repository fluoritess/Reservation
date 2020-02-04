package com.shan.reservation.mapper;

import com.shan.reservation.bean.collect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface collectUtilMapper {
    List<collect> selectByUser(int user_id);
}
