package com.zlt.controller;

import com.zlt.pojo.User;
import com.zlt.result.GraceJSONResult;
import com.zlt.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("获取用户列表")
    @RequestMapping(value = "url",method = RequestMethod.GET)
    public GraceJSONResult getUser(){
        return null;
    }

    @ApiOperation("测试账户、密码")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String test(){
        return null;
    }


    public GraceJSONResult login(String username,String password){
        User user = userService.validateLogin(username,password);
        return GraceJSONResult.ok("登录的三种状态不同的data");
    }

}
