package com.zhb.controller;

import com.zhb.OrderService;
import com.zhb.UserService;
import com.zhb.bean.UserAddress;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhuhaibo
 * @version 1.0
 * @date 2021/6/2 11:18
 */
@Slf4j
@RestController
@RequestMapping("/user/")
public class UserAddressController {

    @Reference
    private UserService userService;
    @Reference
    private OrderService orderService;

    @RequestMapping("initOrder")
    public List<UserAddress> initOrder(@RequestParam String userId){
        log.info("入参{}",userId);
        return orderService.initOrder(userId);
    }

    @RequestMapping("findAll")
    public List<UserAddress> getUserAddressList(@RequestParam String userId){
        log.info("入参{}",userId);
        return userService.getUserAddressList(userId);
    }
}
