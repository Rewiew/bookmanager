package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import com.entity.boardMessage;
import org.springframework.stereotype.Service;

import com.dao.boardMessageMapper;
import com.server.boardMessageServer;
@Service
public class BoardMessageServerImpi implements boardMessageServer {
   @Resource
   private boardMessageMapper gdao;
	@Override
	public int add(boardMessage po) {
		return gdao.insert(po);
	}

	@Override
	public int update(boardMessage po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	@Override
	public int updatelb(boardMessage po) {
		return gdao.updateByPrimaryKeySelectivelb(po);
	}
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<boardMessage> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<boardMessage> getsyliuyanban1(Map<String, Object> map) {
		return gdao.getsyliuyanban1(map);
	}
	public List<boardMessage> getsyliuyanban2(Map<String, Object> map) {
		return gdao.getsyliuyanban2(map);
	}
	public List<boardMessage> getsyliuyanban3(Map<String, Object> map) {
		return gdao.getsyliuyanban3(map);
	}
	
	@Override
	public boardMessage quchongLiuyanban(Map<String, Object> account) {
		return null;
	}

	@Override
	public List<boardMessage> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<boardMessage> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public boardMessage getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

