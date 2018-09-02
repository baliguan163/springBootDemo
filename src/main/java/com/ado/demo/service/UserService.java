package com.ado.demo.service;

import java.util.List;
import com.ado.demo.model.User;

public interface UserService {
	User selectByPrimaryKey(Integer userId);
	int addUser(User user);
    List<User> findUser(int pageNum, int pageSize);
	List<User> findAllUser();
}