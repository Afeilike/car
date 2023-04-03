package com.zlt.service.impl;

import com.zlt.mapper.StuMapper;
import com.zlt.pojo.Stu;
import com.zlt.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired(required = false)
    private StuMapper stuMapper;

    @Override
    public String hello() {
        List<Stu> list = stuMapper.findAll();
        System.out.println(list);
        return "hello";
    }
}
