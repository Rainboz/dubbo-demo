package com.zhb.service.impl;

import com.zhb.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zhuhaibo
 * @version 1.0
 * @date 2021/6/1 22:22
 */
@Slf4j
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String param) {
        log.info("生产者。。。，入参{}",param);
        return "hello "+param;
    }
}
