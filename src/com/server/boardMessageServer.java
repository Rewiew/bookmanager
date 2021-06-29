package com.server;

import java.util.List;

import java.util.Map;

import com.entity.boardMessage;

public interface boardMessageServer {

  public int add(boardMessage po);

  public int update(boardMessage po);
  
  public int updatelb(boardMessage po);
  
  public int delete(int id);

  public List<boardMessage> getAll(Map<String,Object> map);
  public List<boardMessage> getsyliuyanban1(Map<String,Object> map);
  public List<boardMessage> getsyliuyanban2(Map<String,Object> map);
  public List<boardMessage> getsyliuyanban3(Map<String,Object> map);
  public boardMessage quchongLiuyanban(Map<String, Object> map);

  public boardMessage getById(int id);

  public List<boardMessage> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<boardMessage> select(Map<String, Object> map);
}
//	所有List
