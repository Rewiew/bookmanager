package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.DepositMapper;
import com.server.DepositServer;
@Service
public class DepositServerImpi implements DepositServer {
   @Resource
   private DepositMapper gdao;
	@Override
	public int add(com.entity.Deposit po) {
		return gdao.insert(po);
	}
	@Override
	public int update(com.entity.Deposit po) {
		return gdao.updateByPrimaryKeySelective(po);
	}
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}
	@Override
	public List<com.entity.Deposit> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	public List<com.entity.Deposit> getsydingdanxinxi1(Map<String, Object> map) {
		return gdao.getsydingdanxinxi1(map);
	}
	public List<com.entity.Deposit> getsydingdanxinxi2(Map<String, Object> map) {
		return gdao.getsydingdanxinxi2(map);
	}
	public List<com.entity.Deposit> getsydingdanxinxi3(Map<String, Object> map) {
		return gdao.getsydingdanxinxi3(map);
	}
	@Override
	public com.entity.Deposit quchongDingdanxinxi(Map<String, Object> account) {
		return gdao.quchongDingdanxinxi(account);
	}
	@Override
	public List<com.entity.Deposit> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}
	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}
	@Override
	public List<com.entity.Deposit> select(Map<String, Object> map) {
		return gdao.select(map);
	}
	@Override
	public com.entity.Deposit getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}
}

