package com.xmzhou;

import com.xmzhou.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/16 21:25
 */
public class Consumer {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        String name = userService.getUserName("aaa");

        System.out.println(name+"<----------");

        new CountDownLatch(1).await();

    }
}
