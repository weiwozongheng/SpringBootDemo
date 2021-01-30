package com.wwzh.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wwzh.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void sayHello(String name) {
        logger.info("hello {}", name);
    }
}
