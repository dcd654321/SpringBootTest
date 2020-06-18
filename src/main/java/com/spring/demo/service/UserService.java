package com.spring.demo.service;

import com.spring.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    
    public List<User> getUserList();
}
