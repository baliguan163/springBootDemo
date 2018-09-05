package com.ado.demo.service;

import com.ado.demo.entity.Blog;
import java.util.List;

public interface BlogService {
	List<Blog> findAllBlog();
}
//
//public interface UserMapper {
//    int deleteByPrimaryKey(Integer userId);
//    int insert(User record);
//    int insertSelective(User record);
//    User selectByPrimaryKey(Integer userId);
//    int updateByPrimaryKeySelective(User record);
//    int updateByPrimaryKey(User record);
//    //这个方式我自己加的
//    List<User> selectAllUser();
//}
