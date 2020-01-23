package com.shan.reservation.service.impl;

import com.shan.reservation.bean.evaluation;
import com.shan.reservation.mapper.evaluationMapperUtil;
import com.shan.reservation.service.EvaluationService;
import org.apache.ibatis.ognl.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationServiceImpl implements EvaluationService {
    @Autowired
    evaluationMapperUtil evaluationMapperUtil;
    @Override
    public List<evaluation> selectReId(int restaurantId) {
        List<evaluation> list=evaluationMapperUtil.selectReId(restaurantId);
        return list;
    }
}
