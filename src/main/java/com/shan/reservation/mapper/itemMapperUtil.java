package com.shan.reservation.mapper;

import com.shan.reservation.bean.itemExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface itemMapperUtil {
    int deleteByFoodId(int foodId);
}
