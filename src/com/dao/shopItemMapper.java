package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.shopItem;

public interface shopItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(com.entity.shopItem record);

    int insertSelective(com.entity.shopItem record);

    com.entity.shopItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(com.entity.shopItem record);
	
    int updateByPrimaryKey(com.entity.shopItem record);
	public com.entity.shopItem quchongShangpinxinxi(Map<String, Object> shangpinbianhao);
	public List<com.entity.shopItem> getAll(Map<String, Object> map);
	public List<com.entity.shopItem> getsyshangpinxinxi1(Map<String, Object> map);
	public List<com.entity.shopItem> getsyshangpinxinxi3(Map<String, Object> map);
	public List<com.entity.shopItem> getsyshangpinxinxi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<com.entity.shopItem> getByPage(Map<String, Object> map);
	public List<com.entity.shopItem> select(Map<String, Object> map);
//	所有List
}

