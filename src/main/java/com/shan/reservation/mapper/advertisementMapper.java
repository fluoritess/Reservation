package com.shan.reservation.mapper;

import com.shan.reservation.bean.advertisement;
import com.shan.reservation.bean.advertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface advertisementMapper {
    int countByExample(advertisementExample example);

    int deleteByExample(advertisementExample example);

    int deleteByPrimaryKey(Integer advertisementId);

    int insert(advertisement record);

    int insertSelective(advertisement record);

    List<advertisement> selectByExample(advertisementExample example);

    advertisement selectByPrimaryKey(Integer advertisementId);

    int updateByExampleSelective(@Param("record") advertisement record, @Param("example") advertisementExample example);

    int updateByExample(@Param("record") advertisement record, @Param("example") advertisementExample example);

    int updateByPrimaryKeySelective(advertisement record);

    int updateByPrimaryKey(advertisement record);
}