package com.shan.reservation.service.impl;

import com.shan.reservation.service.PearsonService;
import com.shan.reservation.util.Pearson;
import org.springframework.stereotype.Service;

@Service
public class PearsonServiceImpl implements PearsonService {

    @Override
    public double CalculationPearson(double[] a, double[] b) {
        return Pearson.getPearson(a,b);
    }
}
