package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;

@Service
public class UserService 
{
    @Autowired
	private UserMapper userMapper;
    
    
    public User findUser(int id)
    {
    	return userMapper.findUser(id);
    }
	
}
