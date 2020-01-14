package com.shan.reservation.mapper;

import com.shan.reservation.bean.food;
import com.shan.reservation.bean.foodExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface foodMapper {
    int countByExample(foodExample example);

    int deleteByExample(foodExample example);

    int deleteByPrimaryKey(Integer foodId);

    int insert(food record);

    int insertSelective(food record);

    List<food> selectByExample(foodExample example);

    food selectByPrimaryKey(Integer foodId);

    int updateByExampleSelective(@Param("record") food record, @Param("example") foodExample example);

    int updateByExample(@Param("record") food record, @Param("example") foodExample example);

    int updateByPrimaryKeySelective(food record);

    int updateByPrimaryKey(food record);
}