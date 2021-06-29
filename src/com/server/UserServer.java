package com.server;

import java.util.List;

import java.util.Map;

import com.entity.User;

public interface UserServer {

//  验证后台登录
  public User allusersLogin(Map<String, Object> po);

  public int add(User po);

  public int update(User po);

  public int delete(int id);

  public List<User> getAll(Map<String,Object> map);

  public User quchongAllusers(Map<String, Object> map);

  public User getById(int id);

  public List<User> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<User> select(Map<String, Object> map);
}
//	所有List
