package com.winter.controller;

import com.winter.model.UserDomain;
import com.winter.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.insert(user);
    }

    @GetMapping("/delete/{userId}")
    public int deleteUser(@PathVariable("userId") int userId){
        return  userService.deleteUser(userId);
    }

    @GetMapping("/selectById/{userId}")
    public UserDomain selectById(@PathVariable("userId") int userId){
        return  userService.selectById(userId);
    }

    @PostMapping("/update")
    public int updateUser(UserDomain userDomain,int userId){
        UserDomain userDomain1=userService.selectById(userId);
        userDomain1.setUserName(userDomain.getUserName());
        userDomain1.setPassword(userDomain.getPassword());
        userDomain1.setPhoto(userDomain.getPhoto());
        return  userService.updateUser(userDomain);
    }

    @GetMapping("/selectAll")
    public List<UserDomain> selectAll( ){
        return  userService.selectAll();
    }
}
