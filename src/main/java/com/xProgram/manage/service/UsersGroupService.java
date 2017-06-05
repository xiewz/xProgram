package com.xProgram.manage.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xProgram.manage.model.UsersGroup;

public interface UsersGroupService {
	
    Integer getOpenGId(Map<String, Object> map);
	
    Integer updateTotal(Map<String, Object> map);
	
	Integer getOpenIdByGroupNexus(Map<String, Object> map);
	
	Integer getParentOpenIdByGroupNexus(Map<String, Object> map);
	
	Integer insertGroup(Map<String, Object> map);
	
	Integer insertGroupNexus(UsersGroup usersGroup);
	
	List<UsersGroup> getAllGroup(Map<String, Object> map,Integer campusId,Integer limit, Integer offset, String sort,String order,String search);
	
	List<UsersGroup> getAllUserGroup(Map<String, Object> map,Integer campusId,Integer limit, Integer offset, String sort,String order,String search);

    Integer getGroupCount(Map<String, Object> map);
	
	Integer getUserGroupCount(Map<String, Object> map);
	
}
