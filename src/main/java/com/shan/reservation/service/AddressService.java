package com.shan.reservation.service;

import com.shan.reservation.bean.address;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AddressService {
    //根据id查询address详细信息
    address getAddressInfo(int addressid);
}
