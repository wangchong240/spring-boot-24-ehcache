package com.neusoft;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neusoft.dao.UserRepository;
import com.neusoft.entity.Users;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class AppTest {
	
	@Autowired
	private UserRepository repository;
	
	@Test
	public void test() {
		List<Users> list = repository.findAll();
		log.info("result={}", list);
		Assert.assertNotEquals(0, list.size());
	}

}
