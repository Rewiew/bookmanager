package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Deposit;

public interface DepositServer {
  public int add(com.entity.Deposit po);
  public int update(com.entity.Deposit po);
  public int delete(int id);
  public List<com.entity.Deposit> getAll(Map<String,Object> map);
  public List<com.entity.Deposit> getsydingdanxinxi1(Map<String,Object> map);
  public List<com.entity.Deposit> getsydingdanxinxi2(Map<String,Object> map);
  public List<com.entity.Deposit> getsydingdanxinxi3(Map<String,Object> map);
  public com.entity.Deposit quchongDingdanxinxi(Map<String, Object> acount);

  public com.entity.Deposit getById(int id);

  public List<com.entity.Deposit> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<com.entity.Deposit> select(Map<String, Object> map);
}
//	所有List
