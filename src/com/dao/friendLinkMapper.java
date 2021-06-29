package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.friendLink;

public interface friendLinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(com.entity.friendLink record);

    int insertSelective(com.entity.friendLink record);

    com.entity.friendLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(com.entity.friendLink record);
	
    int updateByPrimaryKey(com.entity.friendLink record);
	public com.entity.friendLink quchongYouqinglianjie(Map<String, Object> wangzhanmingcheng);
	public List<com.entity.friendLink> getAll(Map<String, Object> map);
	public List<com.entity.friendLink> getsyyouqinglianjie1(Map<String, Object> map);
	public List<com.entity.friendLink> getsyyouqinglianjie3(Map<String, Object> map);
	public List<com.entity.friendLink> getsyyouqinglianjie2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<com.entity.friendLink> getByPage(Map<String, Object> map);
	public List<com.entity.friendLink> select(Map<String, Object> map);
//	所有List
}

