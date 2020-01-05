package com.shan.reservation.mapper;

import com.shan.reservation.bean.food_category;
import com.shan.reservation.bean.food_categoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface food_categoryMapper {
    int countByExample(food_categoryExample example);

    int deleteByExample(food_categoryExample example);

    int deleteByPrimaryKey(Integer foodCategoryId);

    int insert(food_category record);

    int insertSelective(food_category record);

    List<food_category> selectByExample(food_categoryExample example);

    food_category selectByPrimaryKey(Integer foodCategoryId);

    int updateByExampleSelective(@Param("record") food_category record, @Param("example") food_categoryExample example);

    int updateByExample(@Param("record") food_category record, @Param("example") food_categoryExample example);

    int updateByPrimaryKeySelective(food_category record);

    int updateByPrimaryKey(food_category record);
}