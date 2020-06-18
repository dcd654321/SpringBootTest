package com.spring.demo.mapping;

import com.spring.demo.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface UserMapping {
    @Select("select * from user")
    public User selectAll();



}
