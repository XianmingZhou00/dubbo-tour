package com.xmzhou;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/16 21:16
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.xmzhou.service")
public class MainApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(MainApplication.class);
    }
}
