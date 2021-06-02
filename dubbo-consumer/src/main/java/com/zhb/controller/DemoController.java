package com.zhb.controller;



import com.zhb.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuhaibo
 * @version 1.0
 * @date 2021/6/1 22:14
 */
@Slf4j
@RestController
public class DemoController {

    @Reference
    private DemoService demoService;
    @RequestMapping("/")
    public String sayHello(){
        log.info("消费者调用。。。");
        return demoService.sayHello("world");
    }
}
