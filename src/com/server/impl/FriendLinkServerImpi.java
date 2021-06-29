package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.friendLinkMapper;
import com.server.friendLinkServer;
@Service
public class FriendLinkServerImpi implements friendLinkServer {
   @Resource
   private friendLinkMapper gdao;
	@Override
	public int add(com.entity.friendLink po) {
		return gdao.insert(po);
	}

	@Override
	public int update(com.entity.friendLink po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<com.entity.friendLink> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<com.entity.friendLink> getsyyouqinglianjie1(Map<String, Object> map) {
		return gdao.getsyyouqinglianjie1(map);
	}
	public List<com.entity.friendLink> getsyyouqinglianjie2(Map<String, Object> map) {
		return gdao.getsyyouqinglianjie2(map);
	}
	public List<com.entity.friendLink> getsyyouqinglianjie3(Map<String, Object> map) {
		return gdao.getsyyouqinglianjie3(map);
	}
	
	@Override
	public com.entity.friendLink quchongYouqinglianjie(Map<String, Object> account) {
		return gdao.quchongYouqinglianjie(account);
	}

	@Override
	public List<com.entity.friendLink> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<com.entity.friendLink> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public com.entity.friendLink getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

