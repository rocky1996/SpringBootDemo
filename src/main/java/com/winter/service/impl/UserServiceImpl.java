package com.winter.service.impl;

import com.winter.dao.UserDao;
import com.winter.model.UserDomain;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    public int insert(UserDomain record){
        return userDao.insert(record);
    }

    public int deleteUser(int userId){
        return userDao.deleteUser(userId);
    }

    public int updateUser(UserDomain userDomain){
        return userDao.updateUser(userDomain);
    }

    public UserDomain selectById(int userId){
        return userDao.selectById(userId);
    }

    public List<UserDomain> selectAll(){
        return userDao.selectAll();
    }
}