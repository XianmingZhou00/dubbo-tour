package com.xmzhou;

import com.xmzhou.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/16 22:18
 */
@SpringBootTest
public class DubboTests {

    @DubboReference(url = "dubbo://172.20.10.12:20880/com.xmzhou.service.UserService")
    private UserService userService;


    @Test
    public void testConsumer(){
        String name  = userService.getUserName("aaa");
        System.out.println(name);
    }

}