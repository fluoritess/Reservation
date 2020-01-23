package com.shan.reservation.mapper;

import com.shan.reservation.bean.evaluation;
import com.shan.reservation.bean.evaluationExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface evaluationMapperUtil {
    List<evaluation> selectReId(int restaurantId);
}
