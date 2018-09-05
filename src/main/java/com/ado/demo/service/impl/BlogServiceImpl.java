package com.ado.demo.service.impl;
import com.ado.demo.dao.BlogMapper;
import com.ado.demo.entity.Blog;
import com.ado.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service()
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper; //这里会报错，但是并不会影响

    @Override
    public List<Blog> findAllBlog() {
        return blogMapper.findAllBlog();
    }
}

//	@Override
//	public int addUser(User user) {
//		return userMapper.insertSelective(user);
//	}

	/*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
//	@Override
//	public List<User> findUser(int pageNum, int pageSize) {
//		PageHelper.startPage(pageNum, pageSize);//将参数传给这个方法就可以实现物理分页了，非常简单。
//		return userMapper.selectAllUser();
//	}




//	@Override
//	public User selectByPrimaryKey(Integer userId){
//		return userMapper.selectByPrimaryKey(userId);
//	}


