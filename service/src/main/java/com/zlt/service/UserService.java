package com.zlt.service;

import com.zlt.pojo.User;

public interface UserService {

    public User validateLogin(String username,String password);

}
