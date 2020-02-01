package com.shan.reservation.mapper;

import com.shan.reservation.bean.order;
import com.shan.reservation.bean.orderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface orderMapper {
    int countByExample(orderExample example);

    int deleteByExample(orderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(order record);

    int insertSelective(order record);

    List<order> selectByExample(orderExample example);

    order selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") order record, @Param("example") orderExample example);

    int updateByExample(@Param("record") order record, @Param("example") orderExample example);

    int updateByPrimaryKeySelective(order record);

    int updateByPrimaryKey(order record);
}