package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Review;

public interface ReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(com.entity.Review record);

    int insertSelective(com.entity.Review record);

    com.entity.Review selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(com.entity.Review record);

    int updateByPrimaryKey(com.entity.Review record);
	public com.entity.Review quchongPinglun(Map<String, Object> uname);
	public List<com.entity.Review> getAll(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<com.entity.Review> getByPage(Map<String, Object> map);
	public List<com.entity.Review> select(Map<String, Object> map);
//	所有List
}

