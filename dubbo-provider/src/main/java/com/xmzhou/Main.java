package com.xmzhou;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/16 21:16
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
        applicationContext.start();
        new CountDownLatch(1).await();
    }
}
