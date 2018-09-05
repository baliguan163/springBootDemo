package com.ado.demo.dao;

import com.ado.demo.entity.Fans;

public interface FansMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fans record);

    int insertSelective(Fans record);

    Fans selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fans record);

    int updateByPrimaryKey(Fans record);
}