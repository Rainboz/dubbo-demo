package com.zhb.service.impl;

import com.google.common.collect.Lists;
import com.zhb.UserService;
import com.zhb.bean.UserAddress;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author zhuhaibo
 * @version 1.0
 * @date 2021/6/2 11:01
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        log.info("生产者getUserAddressList...");

        List<UserAddress> result = new ArrayList<>();
        UserAddress u1 = UserAddress.builder()
                .id(1)
                .phoneNum("18788885555")
                .userAddress("address01")
                .build();
        UserAddress u2 = UserAddress.builder()
                .id(2)
                .phoneNum("18758574545")
                .userAddress("address02")
                .build();
        result.add(u1);
        result.add(u2);
        if (Objects.equals("", userId) || Objects.isNull(userId)) {
            log.error("用户id不能为空{}", userId);
            return result;
        }
        return result.stream().filter(f -> Objects.equals(f.getId(), Integer.valueOf(userId))).collect(Collectors.toList());
    }
}
