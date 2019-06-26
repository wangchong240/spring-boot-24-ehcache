package com.neusoft.service;

import java.util.List;

import com.neusoft.entity.Users;

/**
 * 用户信息业务层
 * 
 * @author wangchong
 * @since 2019年6月26日
 */
public interface UsersService {
	
	Users findOne(Integer id);
	
	List<Users> findAll();

}
