package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.UserMapper;
import com.luckincoffee.pojo.User;
import com.luckincoffee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 13:49
 * @Description: ${description}
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User u) {
        userMapper.insert(u);
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updateUser(User c) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}