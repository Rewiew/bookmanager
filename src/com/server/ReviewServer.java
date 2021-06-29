package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Review;

public interface ReviewServer {

  public int add(Review po);

  public int update(Review po);

  public int delete(int id);

  public List<Review> getAll(Map<String,Object> map);

  public Review quchongPinglun(Map<String, Object> map);

  public Review getById(int id);

  public List<Review> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Review> select(Map<String, Object> map);
}
//	所有List
