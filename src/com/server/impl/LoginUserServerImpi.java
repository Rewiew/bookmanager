package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import com.entity.loginUser;
import org.springframework.stereotype.Service;

import com.dao.loginUserMapper;
import com.server.loginUserServer;
@Service
public class LoginUserServerImpi implements loginUserServer {
   @Resource
   private loginUserMapper gdao;
	@Override
	public int add(loginUser po) {
		return gdao.insert(po);
	}

	@Override
	public int update(loginUser po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<loginUser> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<loginUser> getsyyonghuzhuce1(Map<String, Object> map) {
		return gdao.getsyyonghuzhuce1(map);
	}
	public List<loginUser> getsyyonghuzhuce2(Map<String, Object> map) {
		return gdao.getsyyonghuzhuce2(map);
	}
	public List<loginUser> getsyyonghuzhuce3(Map<String, Object> map) {
		return gdao.getsyyonghuzhuce3(map);
	}
	
	@Override
	public loginUser quchongYonghuzhuce(Map<String, Object> account) {
		return gdao.quchongYonghuzhuce(account);
	}

	@Override
	public List<loginUser> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<loginUser> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public loginUser getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

