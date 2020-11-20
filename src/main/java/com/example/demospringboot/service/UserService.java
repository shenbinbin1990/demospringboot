package com.example.demospringboot.service;

import com.example.demospringboot.entity.TbUser;
import com.example.demospringboot.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    public TbUser selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
