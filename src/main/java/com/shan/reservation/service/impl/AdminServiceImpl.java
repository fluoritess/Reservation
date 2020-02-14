package com.shan.reservation.service.impl;

import com.shan.reservation.bean.address;
import com.shan.reservation.bean.admin;
import com.shan.reservation.mapper.adminMapper;
import com.shan.reservation.service.AddressService;
import com.shan.reservation.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    adminMapper adminMapper;
    @Override
    public admin SelectAdminByName(String name) {
        List<admin> list=adminMapper.selectByExample(null);
        Iterator it=list.iterator();
        while(it.hasNext()){
            admin admin=(admin)it.next();
            if(name.equals(admin.getAdminName())){
                return admin;
            }
        }
        return null;
    }
}
