package com.shan.reservation.service;

import com.shan.reservation.bean.evaluation;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsw
 * @Package com.shan.reservation.service
 * @Description:
 * @date 2020年1月23日 22:43:23
 */
@Service
public interface EvaluationService {
    List<evaluation> selectReId(int restaurantId);
    List<evaluation> selectByFoodId(int foodId);
    List<evaluation> selectByuserId(int userId);
}
