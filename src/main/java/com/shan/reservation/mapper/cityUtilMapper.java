package com.shan.reservation.mapper;

import com.shan.reservation.bean.city_info;
import com.shan.reservation.bean.city_infoExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface cityUtilMapper {
    List<city_info> selectDistictByName(String city_name);
}
