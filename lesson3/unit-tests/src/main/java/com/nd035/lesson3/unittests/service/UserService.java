package com.nd035.lesson3.unittests.service;

import com.nd035.lesson3.unittests.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}
