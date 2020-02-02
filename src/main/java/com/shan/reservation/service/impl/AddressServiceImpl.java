package com.shan.reservation.service.impl;

import com.shan.reservation.bean.address;
import com.shan.reservation.mapper.addressMapper;
import com.shan.reservation.mapper.addressMapperUtil;
import com.shan.reservation.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    addressMapper addressMapper;
    @Autowired
    addressMapperUtil addressMapperUtil;
    @Override
    public address getAddressInfo(int addressid) {
        address address=addressMapper.selectByPrimaryKey(addressid);
        return address;
    }

    @Override
    public List<address> getAddressByUser(int userid) {
        List<address> list=addressMapperUtil.getAddressByUser(userid);
        return list;
    }
}
