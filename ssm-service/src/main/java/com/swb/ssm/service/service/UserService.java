package com.swb.ssm.service.service;

import com.swb.ssm.service.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User getById(long userId);

    int update(User user);

    int deleteById(long userId);

    int insert(User user);
}
