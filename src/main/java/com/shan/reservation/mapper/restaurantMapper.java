package com.shan.reservation.mapper;

import com.shan.reservation.bean.restaurant;
import com.shan.reservation.bean.restaurantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface restaurantMapper {
    int countByExample(restaurantExample example);

    int deleteByExample(restaurantExample example);

    int deleteByPrimaryKey(Integer restaurantId);

    int insert(restaurant record);

    int insertSelective(restaurant record);

    List<restaurant> selectByExample(restaurantExample example);

    restaurant selectByPrimaryKey(Integer restaurantId);

    int updateByExampleSelective(@Param("record") restaurant record, @Param("example") restaurantExample example);

    int updateByExample(@Param("record") restaurant record, @Param("example") restaurantExample example);

    int updateByPrimaryKeySelective(restaurant record);

    int updateByPrimaryKey(restaurant record);
}