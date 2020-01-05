package com.shan.reservation.mapper;

import com.shan.reservation.bean.address;
import com.shan.reservation.bean.addressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface addressMapper {
    int countByExample(addressExample example);

    int deleteByExample(addressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(address record);

    int insertSelective(address record);

    List<address> selectByExample(addressExample example);

    address selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") address record, @Param("example") addressExample example);

    int updateByExample(@Param("record") address record, @Param("example") addressExample example);

    int updateByPrimaryKeySelective(address record);

    int updateByPrimaryKey(address record);
}