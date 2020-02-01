package com.shan.reservation.service;

import com.shan.reservation.bean.order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsw
 * @Package com.gabe.mychat.service
 * @Description:
 * @date 2020年2月1日 18:17:12
 */
@Service
public interface OrderService {
    List<order> selectByUserId(int userId);
}
