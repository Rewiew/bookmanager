package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.loginUser;

public interface loginUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(loginUser record);

    int insertSelective(loginUser record);

    loginUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(loginUser record);
	
    int updateByPrimaryKey(loginUser record);
	public loginUser quchongYonghuzhuce(Map<String, Object> yonghuming);
	public List<loginUser> getAll(Map<String, Object> map);
	public List<loginUser> getsyyonghuzhuce1(Map<String, Object> map);
	public List<loginUser> getsyyonghuzhuce3(Map<String, Object> map);
	public List<loginUser> getsyyonghuzhuce2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<loginUser> getByPage(Map<String, Object> map);
	public List<loginUser> select(Map<String, Object> map);
//	所有List
}

