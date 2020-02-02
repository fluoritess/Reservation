package com.shan.reservation.mapper;

import com.shan.reservation.bean.address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface addressMapperUtil {
    List<address> getAddressByUser(int userid);
}
