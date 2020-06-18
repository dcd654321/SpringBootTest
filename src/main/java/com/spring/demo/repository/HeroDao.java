package com.spring.demo.repository;

import com.spring.demo.domain.Hero;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroDao {
    @Select("select * from heroes")
    public Hero[] getHeros();

    @Select("select * from heroes where id = #{id}")
    public Hero getHeroById(Integer id);
}
