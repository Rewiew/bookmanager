package com.server;

import java.util.List;

import java.util.Map;

import com.entity.loginUser;

public interface loginUserServer {

  public int add(loginUser po);

  public int update(loginUser po);
  
  
  
  public int delete(int id);

  public List<loginUser> getAll(Map<String,Object> map);
  public List<loginUser> getsyyonghuzhuce1(Map<String,Object> map);
  public List<loginUser> getsyyonghuzhuce2(Map<String,Object> map);
  public List<loginUser> getsyyonghuzhuce3(Map<String,Object> map);
  public loginUser quchongYonghuzhuce(Map<String, Object> acount);

  public loginUser getById(int id);

  public List<loginUser> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<loginUser> select(Map<String, Object> map);
}
//	所有List
