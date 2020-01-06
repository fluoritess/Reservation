package com.shan.reservation.service.impl;

import com.shan.reservation.bean.city_info;
import com.shan.reservation.mapper.cityUtilMapper;
import com.shan.reservation.mapper.city_infoMapper;
import com.shan.reservation.service.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    city_infoMapper city_infoMapper;
    @Autowired
    cityUtilMapper cityUtilMapper;
    @Override
    public List<city_info> SelectDistictByCity(String city_name) {
//        List<city_info> list=city_infoMapper.selectByExample(null);
//        Iterator it=list.iterator();
//        List<String> tartlist=null;
//        while(it.hasNext()){
//            city_info city_info=(city_info)it.next();
//            if(city_info.getCityName().equals(city_name)){
//                System.out.print(city_info.getCityDistict());
//                tartlist.add(city_info.getCityDistict());
//            }
//        }
        List<city_info> list=cityUtilMapper.selectDistictByName(city_name);
        return list;
    }
}
