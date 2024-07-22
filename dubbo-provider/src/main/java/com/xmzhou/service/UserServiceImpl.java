package com.xmzhou.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/16 21:10
 */
@DubboService
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String name) {
        return UUID.randomUUID().toString() + " " + name;
    }
}
