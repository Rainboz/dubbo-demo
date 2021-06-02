package com.zhb.service.impl;

import com.zhb.OrderService;
import com.zhb.bean.UserAddress;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author zhuhaibo
 * @version 1.0
 * @date 2021/6/2 11:23
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<UserAddress> initOrder(String userId) {
        log.info("生产者initOrder...");
        List<UserAddress> result = new ArrayList<>();
        UserAddress u1 = UserAddress.builder()
                .id(1)
                .phoneNum("18788885555")
                .userAddress("address1 init")
                .build();
        UserAddress u2 = UserAddress.builder()
                .id(2)
                .phoneNum("18758574545")
                .userAddress("address2 init")
                .build();
        result.add(u1);
        result.add(u2);
        return result.stream().filter(f -> Objects.equals(f.getId(), Integer.valueOf(userId))).collect(Collectors.toList());
    }
}
