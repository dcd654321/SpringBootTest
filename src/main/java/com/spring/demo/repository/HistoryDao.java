package com.spring.demo.repository;

import com.spring.demo.domain.History;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryDao {

    @Insert("insert into doublecolorballhis(phase, red1, red2, red3, red4, red5, red6, blue) value(#{phase}, #{red1}, #{red2}, #{red3}, #{red4}, #{red5}, #{red6}, #{blue});")
    public void insertHis(History his);

    @Delete("delete from doublecolorballhis")
    public void deleteAll();
}
