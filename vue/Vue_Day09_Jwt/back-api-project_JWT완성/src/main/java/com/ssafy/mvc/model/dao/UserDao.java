package com.ssafy.mvc.model.dao;

import java.util.List;
import java.util.Map;

import com.ssafy.mvc.model.dto.User;

public interface UserDao {
	//전체 유저 목록
	public List<User> selectAll();

	//유저 등록
	public int insertUser(User user);
	
	//유저 조회
	public User selectOne(Map<String, String> info);
}