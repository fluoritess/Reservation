package com.shan.reservation.mapper;

import com.shan.reservation.bean.coupon;
import com.shan.reservation.bean.couponExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface couponMapper {
    int countByExample(couponExample example);

    int deleteByExample(couponExample example);

    int deleteByPrimaryKey(Integer couponId);

    int insert(coupon record);

    int insertSelective(coupon record);

    List<coupon> selectByExample(couponExample example);

    coupon selectByPrimaryKey(Integer couponId);

    int updateByExampleSelective(@Param("record") coupon record, @Param("example") couponExample example);

    int updateByExample(@Param("record") coupon record, @Param("example") couponExample example);

    int updateByPrimaryKeySelective(coupon record);

    int updateByPrimaryKey(coupon record);
}