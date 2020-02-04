package com.shan.reservation.mapper;

import com.shan.reservation.bean.collect;
import com.shan.reservation.bean.collectExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface collectMapper {
    int countByExample(collectExample example);

    int deleteByExample(collectExample example);

    int deleteByPrimaryKey(Integer collecteId);

    int insert(collect record);

    int insertSelective(collect record);

    List<collect> selectByExample(collectExample example);

    collect selectByPrimaryKey(Integer collecteId);

    int updateByExampleSelective(@Param("record") collect record, @Param("example") collectExample example);

    int updateByExample(@Param("record") collect record, @Param("example") collectExample example);

    int updateByPrimaryKeySelective(collect record);

    int updateByPrimaryKey(collect record);
}