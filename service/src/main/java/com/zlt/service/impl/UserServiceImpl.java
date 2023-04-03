package com.zlt.service.impl;

import com.zlt.mapper.UserDao;
import com.zlt.pojo.User;
import com.zlt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserDao userDao;

    //VO,异常,Map.....
    @Override
    public User validateLogin(String username, String password) {
        User user = userDao.findByName(username);

        if(user == null){
            //用户名不存在
        }else if(!user.getPassword().equals(password)){
            //密码错误
        }else{
            //登录成功，user
        }

        return null;
    }
}


