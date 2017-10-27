package com.ado.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ado.demo.domain.User;
import com.ado.demo.service.UserService;

@RestController
public class UserController {

   @Autowired
   private UserService userService;

	/**
	 * 需求:返回json格式数据
	 */
	@RequestMapping("hello")
	public String showHello() {
		return "hello world!";
	}

	/**
	 * 需求：返回一个POJO对象
	 */
	@RequestMapping("pojo")
	public User showUser() {
		User user = new User();
		user.setId(1);
		user.setName("张三丰");
		user.setSex("男");
		user.setBirthday(new Date());
		user.setAddress("武当山");
		return user;
	}
	
	@RequestMapping("maps")
	public Map<String,Object> showMaps() {
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("username", "张无忌");
		maps.put("age", "19");
		return maps;
	}
	
	@RequestMapping("list")
	public List<User> showList() {
		List<User> uList = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("张三丰1");
		user.setSex("男");
		user.setBirthday(new Date());
		user.setAddress("武当山");
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("张三丰2");
		user2.setSex("男");
		user2.setBirthday(new Date());
		user2.setAddress("武当山");
		
		uList.add(user);
		uList.add(user2);
		return uList;
	}
	
	
	//整合Mybatis操作
	@RequestMapping("ssm")
	public List<User> findAll(){
	  List<User> list = userService.findAll();
	  return list;
	  }
	
    
}
