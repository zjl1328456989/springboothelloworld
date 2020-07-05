package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
//@Transactional(propagation = Propagation.REQUIRED) //事务的传播特性
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    @Transactional(isolation = Isolation.DEFAULT)//隔离级别
    public List<User> findAll() {
        return userDao.findAll();
    }
}
