package com.shan.reservation.service;

import com.shan.reservation.bean.admin;
import org.springframework.stereotype.Service;

/**
 * @author wsw
 * @Package com.shan.reservation.service
 * @Description:管理员接口
 * @date 2020年2月9日 15:19:22
 */
@Service
public interface AdminService {
    admin SelectAdminByName(String name);
}
