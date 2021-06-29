package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.boardMessage;

public interface boardMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(boardMessage record);

    int insertSelective(boardMessage record);

    boardMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(boardMessage record);
	int updateByPrimaryKeySelectivelb(boardMessage record);
    int updateByPrimaryKey(boardMessage record);
	public boardMessage quchongLiuyanban(Map<String, Object> uname);
	public List<boardMessage> getAll(Map<String, Object> map);
	public List<boardMessage> getsyliuyanban1(Map<String, Object> map);
	public List<boardMessage> getsyliuyanban3(Map<String, Object> map);
	public List<boardMessage> getsyliuyanban2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<boardMessage> getByPage(Map<String, Object> map);
	public List<boardMessage> select(Map<String, Object> map);
//	所有List
}

