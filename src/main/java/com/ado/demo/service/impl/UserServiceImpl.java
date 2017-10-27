package com.ado.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ado.demo.domain.User;
import com.ado.demo.mapper.UserMapper;
import com.ado.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	//注入mapper接口代理对象
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;

	}

}
