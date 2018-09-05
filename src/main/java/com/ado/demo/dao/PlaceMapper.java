package com.ado.demo.dao;

import com.ado.demo.entity.Place;

public interface PlaceMapper {
    int deleteByPrimaryKey(Integer placeId);

    int insert(Place record);

    int insertSelective(Place record);

    Place selectByPrimaryKey(Integer placeId);

    int updateByPrimaryKeySelective(Place record);

    int updateByPrimaryKey(Place record);
}