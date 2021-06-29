package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import com.entity.News;
import org.springframework.stereotype.Service;

import com.dao.NewsMapper;
import com.server.NewsServer;
@Service
public class NewsServerImpi implements NewsServer {
   @Resource
   private NewsMapper gdao;
	@Override
	public int add(News po) {
		return gdao.insert(po);
	}

	@Override
	public int update(News po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<News> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	
	@Override
	public List<News> getsyxinwentongzhi1(Map<String, Object> map) {
		return gdao.getsyxinwentongzhi1(map);
	}
	@Override
	public List<News> getsyxinwentongzhi2(Map<String, Object> map) {
		return gdao.getsyxinwentongzhi2(map);
	}
	@Override
	public List<News> getsyxinwentongzhi3(Map<String, Object> map) {
		return gdao.getsyxinwentongzhi3(map);
	}
	
	
	@Override
	public News quchongXinwentongzhi(String account) {
		return null;
	}

	@Override
	public List<News> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<News> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public News getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

