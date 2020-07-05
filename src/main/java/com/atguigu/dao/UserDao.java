package com.atguigu.dao;

import com.atguigu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao{

    @Select("select * from user")
    public List<User> findAll();
}
