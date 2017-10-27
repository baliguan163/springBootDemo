package com.ado.demo.service;

import java.util.List;
import com.ado.demo.domain.User;

public interface UserService {
	 /**
	    * 需求：查询所有用户
	    * @return 
	    */
      public List<User> findAll();
}
