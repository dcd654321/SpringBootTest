package com.spring.demo.service.impl;

import com.spring.demo.domain.User;
import com.spring.demo.repository.UserDao;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public void addUser(User user){
        userDao.addUser(user);
    }

    @Override
    public List<User> getUserList() {
        List<User> list = userDao.getUserList();
        return list;
    }
}
