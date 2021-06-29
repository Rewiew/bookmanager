package com.server;

import java.util.List;

import java.util.Map;

import com.entity.News;

public interface NewsServer {

  public int add(News po);

  public int update(News po);

  public int delete(int id);

  public List<News> getAll(Map<String,Object> map);
  public List<News> getsyxinwentongzhi1(Map<String,Object> map);
  public List<News> getsyxinwentongzhi2(Map<String,Object> map);
  public List<News> getsyxinwentongzhi3(Map<String,Object> map);

  public News quchongXinwentongzhi(String account);

  public News getById(int id);

  public List<News> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<News> select(Map<String, Object> map);
}
//	所有List
