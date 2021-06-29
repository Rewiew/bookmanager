package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
	public News quchongXinwentongzhi(Map<String, Object> uname);
	public List<News> getAll(Map<String, Object> map);
	
	public List<News> getsyxinwentongzhi1(Map<String, Object> map);
	public List<News> getsyxinwentongzhi2(Map<String, Object> map);
	public List<News> getsyxinwentongzhi3(Map<String, Object> map);
	
	public int getCount(Map<String, Object> po);
	public List<News> getByPage(Map<String, Object> map);
	public List<News> select(Map<String, Object> map);
//	所有List
}

