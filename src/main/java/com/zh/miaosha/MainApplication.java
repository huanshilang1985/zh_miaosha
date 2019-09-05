package com.zh.miaosha;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author zhanghe
 * Desc: 项目启动类
 * Date 2019/8/10 8:24
 */
@Slf4j
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        log.info("============ App Started  ============");
    }




}
