package com.server;

import java.util.List;

import java.util.Map;

import com.entity.friendLink;

public interface friendLinkServer {

  public int add(friendLink po);

  public int update(friendLink po);
  
  
  
  public int delete(int id);

  public List<friendLink> getAll(Map<String,Object> map);
  public List<friendLink> getsyyouqinglianjie1(Map<String,Object> map);
  public List<friendLink> getsyyouqinglianjie2(Map<String,Object> map);
  public List<friendLink> getsyyouqinglianjie3(Map<String,Object> map);
  public friendLink quchongYouqinglianjie(Map<String, Object> acount);

  public friendLink getById(int id);

  public List<friendLink> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<friendLink> select(Map<String, Object> map);
}
//	所有List
