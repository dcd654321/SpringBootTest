package com.spring.demo.repository;

import com.spring.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Insert("insert into user(id, name, gender) values (#{id}, #{name}, #{gender})")
    public void addUser(User user);

    @Select("select * from user ")
    public List<User> getUserList();
}
