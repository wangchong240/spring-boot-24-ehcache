package com.neusoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neusoft.entity.Users;

/**
 * 用户持久层
 * @author wang.chong
 * @date 2019年6月25日
 */
public interface UserRepository extends JpaRepository<Users, Integer> {

}
