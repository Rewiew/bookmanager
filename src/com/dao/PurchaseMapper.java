package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Purchase;

public interface PurchaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    Purchase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Purchase record);
	
    int updateByPrimaryKey(Purchase record);
	public Purchase quchongGoumaijilu(Map<String, Object> yonghuming);
	public List<Purchase> getAll(Map<String, Object> map);
	public List<Purchase> getsygoumaijilu1(Map<String, Object> map);
	public List<Purchase> getsygoumaijilu3(Map<String, Object> map);
	public List<Purchase> getsygoumaijilu2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Purchase> getByPage(Map<String, Object> map);
	public List<Purchase> select(Map<String, Object> map);
//	所有List
}

