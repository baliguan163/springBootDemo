package com.ado.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.ado.demo.domain.User;

@Mapper
public interface UserMapper {
    /**
    * 需求：查询所有用户
    * @return 
    */
	 public List<User> findAll();
}
