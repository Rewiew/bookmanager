package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import com.entity.Purchase;
import org.springframework.stereotype.Service;

import com.dao.PurchaseMapper;
import com.server.PurchaseServer;
@Service
public class PurchaseServerImpi implements PurchaseServer {
   @Resource
   private PurchaseMapper gdao;
	@Override
	public int add(Purchase po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Purchase po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Purchase> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Purchase> getsygoumaijilu1(Map<String, Object> map) {
		return gdao.getsygoumaijilu1(map);
	}
	public List<Purchase> getsygoumaijilu2(Map<String, Object> map) {
		return gdao.getsygoumaijilu2(map);
	}
	public List<Purchase> getsygoumaijilu3(Map<String, Object> map) {
		return gdao.getsygoumaijilu3(map);
	}
	
	@Override
	public Purchase quchongGoumaijilu(Map<String, Object> account) {
		return gdao.quchongGoumaijilu(account);
	}

	@Override
	public List<Purchase> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Purchase> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Purchase getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

