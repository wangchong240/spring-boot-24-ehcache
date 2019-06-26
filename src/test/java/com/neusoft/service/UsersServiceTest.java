package com.neusoft.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neusoft.entity.Users;

import lombok.extern.slf4j.Slf4j;

/**
 * 业务层测试类
 * 
 * @author wangchong
 * @since 2019年6月26日
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UsersServiceTest {
	
	@Autowired
	private UsersService service;
	
	@Test
	public void findOneTest() {
		Users result = service.findOne(1);
		log.info("result={}", result);
		
		Users result1 = service.findOne(1);
		log.info("result={}", result1);
	}

}
