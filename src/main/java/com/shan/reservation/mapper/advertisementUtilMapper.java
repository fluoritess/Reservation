package com.shan.reservation.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface advertisementUtilMapper {
    void updateAdvertisementSetState1(String advertisementTitle);
    void updateAdvertisementSetState0(String advertisementTitle);
}
