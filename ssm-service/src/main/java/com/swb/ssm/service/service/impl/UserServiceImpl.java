package com.swb.ssm.service.service.impl;

import com.swb.ssm.service.dao.UserDao;
import com.swb.ssm.service.entity.User;
import com.swb.ssm.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    public User getById(long userId) {
        return userDao.queryById(userId);
    }

    public UserServiceImpl() {
        super();
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int deleteById(long userId) {
        return userDao.deleteById(userId);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }
}
