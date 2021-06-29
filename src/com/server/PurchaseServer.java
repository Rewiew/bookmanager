package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Purchase;

public interface PurchaseServer {

  public int add(Purchase po);

  public int update(Purchase po);
  
  
  
  public int delete(int id);

  public List<Purchase> getAll(Map<String,Object> map);
  public List<Purchase> getsygoumaijilu1(Map<String,Object> map);
  public List<Purchase> getsygoumaijilu2(Map<String,Object> map);
  public List<Purchase> getsygoumaijilu3(Map<String,Object> map);
  public Purchase quchongGoumaijilu(Map<String, Object> acount);

  public Purchase getById(int id);

  public List<Purchase> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Purchase> select(Map<String, Object> map);
}
//	所有List
