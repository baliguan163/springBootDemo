package com.ado.demo.dao;

import com.ado.demo.entity.Blog;

import java.util.List;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer blogId);
    int insert(Blog record);
    int insertSelective(Blog record);
    Blog selectByPrimaryKey(Integer blogId);
    int updateByPrimaryKeySelective(Blog record);
    int updateByPrimaryKeyWithBLOBs(Blog record);
    int updateByPrimaryKey(Blog record);
    List<Blog> findAllBlog();
}