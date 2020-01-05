package com.shan.reservation.service.impl;

import com.shan.reservation.bean.address;
import com.shan.reservation.mapper.addressMapper;
import com.shan.reservation.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    addressMapper addressMapper;
    @Override
    public address getAddressInfo(int addressid) {
        address address=addressMapper.selectByPrimaryKey(addressid);
        return address;
    }
}
