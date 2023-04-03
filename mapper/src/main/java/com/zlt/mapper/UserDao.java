package com.zlt.mapper;

import com.zlt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where username = #{name}")
    public User findByName(String name);

}
