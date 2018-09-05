package com.ado.demo.dao;

import com.ado.demo.entity.BlogLabel;

public interface BlogLabelMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(BlogLabel record);
    int insertSelective(BlogLabel record);
    BlogLabel selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(BlogLabel record);
    int updateByPrimaryKey(BlogLabel record);
}