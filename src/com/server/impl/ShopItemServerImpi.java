package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.shopItemMapper;
import com.server.shopItemServer;
@Service
public class ShopItemServerImpi implements shopItemServer {
   @Resource
   private shopItemMapper gdao;
	@Override
	public int add(com.entity.shopItem po) {
		return gdao.insert(po);
	}

	@Override
	public int update(com.entity.shopItem po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<com.entity.shopItem> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<com.entity.shopItem> getsyshangpinxinxi1(Map<String, Object> map) {
		return gdao.getsyshangpinxinxi1(map);
	}
	public List<com.entity.shopItem> getsyshangpinxinxi2(Map<String, Object> map) {
		return gdao.getsyshangpinxinxi2(map);
	}
	public List<com.entity.shopItem> getsyshangpinxinxi3(Map<String, Object> map) {
		return gdao.getsyshangpinxinxi3(map);
	}
	
	@Override
	public com.entity.shopItem quchongShangpinxinxi(Map<String, Object> account) {
		return gdao.quchongShangpinxinxi(account);
	}

	@Override
	public List<com.entity.shopItem> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<com.entity.shopItem> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public com.entity.shopItem getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

