package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Deposit;

public interface DepositMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Deposit record);

    int insertSelective(Deposit record);

    Deposit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Deposit record);
	
    int updateByPrimaryKey(Deposit record);
	public Deposit quchongDingdanxinxi(Map<String, Object> yonghuming);
	public List<Deposit> getAll(Map<String, Object> map);
	public List<Deposit> getsydingdanxinxi1(Map<String, Object> map);
	public List<Deposit> getsydingdanxinxi3(Map<String, Object> map);
	public List<Deposit> getsydingdanxinxi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Deposit> getByPage(Map<String, Object> map);
	public List<Deposit> select(Map<String, Object> map);
//	所有List
}

