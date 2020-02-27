package com.shan.reservation.service;

import com.shan.reservation.bean.advertisement;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsw
 * @Package com.gabe.mychat.controller
 * @Description:广告接口
 * @date 2020年2月27日 15:39:35
 */
@Service
public interface advertisementService {
    List<advertisement> resTaurantSelectAdvertise(int re_id);
}
