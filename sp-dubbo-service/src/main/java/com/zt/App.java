package com.zt;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.zt.dao")
@DubboComponentScan("com.zt.service")
@Slf4j
@EnableDubboConfig
public class App {
    public static void main(String[] args) {
        log.info("服务启动开始了");
//        System.setProperty("dubbo.application.logger", "slf4j");
//        System.setProperty("zookeeper.request.timeout", "600000");
//        System.setProperty("zookeeper.client.sasl","false");
        SpringApplication.run(App.class,args);
        log.info("服务启动完成了");
    }
}
