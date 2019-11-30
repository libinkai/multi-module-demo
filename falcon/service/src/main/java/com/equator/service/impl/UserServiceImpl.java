package com.equator.service.impl;

import com.equator.dao.generate.UserMapper;
import com.equator.model.po.User;
import com.equator.model.po.UserExample;
import com.equator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Equator
 * @Date: 2019/11/30 9:38
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        return userMapper.selectByExample(example);
    }
}
