package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import com.entity.User;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;

import com.server.UserServer;
@Service
public class UserServerImpi implements UserServer {
   @Resource
   private UserMapper gdao;
   
   @Override
	public User allusersLogin(Map<String, Object> po) {
		System.out.println("userdao---");
		return gdao.allusersLogin(po);
	}
   
	@Override
	public int add(User po) {
		return gdao.insert(po);
	}

	@Override
	public int update(User po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<User> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}

	@Override
	public User quchongAllusers(Map<String, Object> account) {
		return null;
	}

	@Override
	public List<User> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<User> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public User getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

