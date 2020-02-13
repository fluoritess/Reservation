package com.shan.reservation.controller;

import com.shan.reservation.bean.address;
import com.shan.reservation.bean.cartutil;
import com.shan.reservation.bean.user;
import com.shan.reservation.mapper.addressMapper;
import com.shan.reservation.service.AddressService;
import com.shan.reservation.service.UserService;
import com.shan.reservation.util.ArchivesLog;
import com.shan.reservation.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package com.gabe.mychat.controller
 * @Description:地址controller
 * @date 2020年2月2日 17:06:30
 */
@Controller
public class AddressController {
    @Autowired
    AddressService AddressService;
    @Autowired
    addressMapper addressMapper;
    @ResponseBody
    @RequestMapping("/getAddressByUser" )
    @ArchivesLog(operationType = "查询信息", operationName = "查询用户收货地址")
    public R getAddressByUser(@RequestBody Map<String,String> map, HttpSession httpSession){
        int userid=Integer.parseInt(map.get("id"));
        List<address> list=AddressService.getAddressByUser(userid);
        return  R.ok().put("address",list);
    }
    @ResponseBody
    @RequestMapping("/getAddressById" )
    @ArchivesLog(operationType = "查询信息", operationName = "根据id查询用户收货地址")
    public R getAddressById(@RequestBody Map<String,String> map, HttpSession httpSession){
        int addressId=Integer.parseInt(map.get("addressId"));
        address address=addressMapper.selectByPrimaryKey(addressId);
        return  R.ok().put("address",address);
    }
}
