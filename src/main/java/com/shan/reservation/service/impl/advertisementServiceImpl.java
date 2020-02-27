package com.shan.reservation.service.impl;

import com.shan.reservation.bean.advertisement;
import com.shan.reservation.mapper.advertisementMapper;
import com.shan.reservation.service.advertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class advertisementServiceImpl implements advertisementService {
    @Autowired
    advertisementMapper advertisementMapper;
    @Override
    public List<advertisement> resTaurantSelectAdvertise(int re_id) {
        List<advertisement> list= advertisementMapper.selectByExample(null);
        List<advertisement> tarlist=new ArrayList<>();
        Iterator it=list.iterator();
        while(it.hasNext()){
                advertisement advertisement=(advertisement)it.next();
                if(advertisement.getRestaurantId()==re_id){
                    tarlist.add(advertisement);
                }
        }
        return tarlist;
    }
}
