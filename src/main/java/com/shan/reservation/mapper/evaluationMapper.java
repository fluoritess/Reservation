package com.shan.reservation.mapper;

import com.shan.reservation.bean.evaluation;
import com.shan.reservation.bean.evaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface evaluationMapper {
    int countByExample(evaluationExample example);

    int deleteByExample(evaluationExample example);

    int deleteByPrimaryKey(Integer evaluationId);

    int insert(evaluation record);

    int insertSelective(evaluation record);

    List<evaluation> selectByExample(evaluationExample example);

    evaluation selectByPrimaryKey(Integer evaluationId);

    int updateByExampleSelective(@Param("record") evaluation record, @Param("example") evaluationExample example);

    int updateByExample(@Param("record") evaluation record, @Param("example") evaluationExample example);

    int updateByPrimaryKeySelective(evaluation record);

    int updateByPrimaryKey(evaluation record);
}