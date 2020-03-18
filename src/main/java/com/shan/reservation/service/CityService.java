package com.shan.reservation.service;

import com.shan.reservation.bean.city_info;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsw
 * @Package com.shan.reservation.service
 * @Description:
 * @date 2020年1月6日 13:17:42
 */
@Service
public interface CityService {
    List<city_info> SelectDistictByCity(String city_name);
}
