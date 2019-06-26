package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserRepository;
import com.neusoft.entity.Users;
import com.neusoft.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UserRepository repository;
	
	@Override
	@Cacheable(value = "firstCache")
	public Users findOne(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public List<Users> findAll() {
		return repository.findAll();
	}

}
