package com.winter.service;

import com.winter.model.UserDomain;

import java.util.List;

public interface UserService {
    public int insert(UserDomain record);
    public int deleteUser(int userId);
    public int updateUser(UserDomain userDomain);
    public UserDomain selectById(int userId);
    public List<UserDomain> selectAll();
}
