package com.shan.reservation.mapper;

import com.shan.reservation.bean.city_info;
import com.shan.reservation.bean.city_infoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface city_infoMapper {
    int countByExample(city_infoExample example);

    int deleteByExample(city_infoExample example);

    int insert(city_info record);

    int insertSelective(city_info record);

    List<city_info> selectByExample(city_infoExample example);

    int updateByExampleSelective(@Param("record") city_info record, @Param("example") city_infoExample example);

    int updateByExample(@Param("record") city_info record, @Param("example") city_infoExample example);
}