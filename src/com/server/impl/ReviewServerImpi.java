package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ReviewMapper;
import com.server.ReviewServer;
@Service
public class ReviewServerImpi implements ReviewServer {
   @Resource
   private ReviewMapper gdao;
	@Override
	public int add(com.entity.Review po) {
		return gdao.insert(po);
	}

	@Override
	public int update(com.entity.Review po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<com.entity.Review> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}

	@Override
	public com.entity.Review quchongPinglun(Map<String, Object> account) {
		return null;
	}

	@Override
	public List<com.entity.Review> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<com.entity.Review> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public com.entity.Review getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

