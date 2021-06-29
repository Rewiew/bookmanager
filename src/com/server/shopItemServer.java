package com.server;

import java.util.List;

import java.util.Map;

import com.entity.shopItem;

public interface shopItemServer {

  public int add(shopItem po);

  public int update(shopItem po);
  
  
  
  public int delete(int id);

  public List<shopItem> getAll(Map<String,Object> map);
  public List<shopItem> getsyshangpinxinxi1(Map<String,Object> map);
  public List<shopItem> getsyshangpinxinxi2(Map<String,Object> map);
  public List<shopItem> getsyshangpinxinxi3(Map<String,Object> map);
  public shopItem quchongShangpinxinxi(Map<String, Object> acount);

  public shopItem getById(int id);

  public List<shopItem> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<shopItem> select(Map<String, Object> map);
}
//	所有List
