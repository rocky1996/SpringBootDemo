package com.winter.dao;

import com.winter.model.UserDomain;

import java.util.List;

public interface UserDao {
    public int insert(UserDomain record);
    public int deleteUser(int userId);
    public int updateUser(UserDomain userDomain);
    public UserDomain selectById(int userId);
    public List<UserDomain> selectAll();
}
