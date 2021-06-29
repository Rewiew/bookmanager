package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.User;


public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
	public User quchongAllusers(Map<String, Object> uname);
	public List<User> getAll(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<User> getByPage(Map<String, Object> map);
	public List<User> select(Map<String, Object> map);
	
	public User allusersLogin(Map<String, Object> po);
//	所有List
}

