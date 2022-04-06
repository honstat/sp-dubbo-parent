package com.zt.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@EnableDubboConfig
@DubboComponentScan("com.zt.consumer.controller")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
       log.info("启动完成");
    }
}
