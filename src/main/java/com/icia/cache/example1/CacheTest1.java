package com.icia.cache.example1;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import lombok.extern.slf4j.*;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class CacheTest1 {
	@Autowired
	private CacheService1 service;
	@Test
	public void testA() {
		System.out.println("===============================================");
		log.info("{}", service.read(1000));
		System.out.println("===============================================");
		log.info("{}", service.read(1000));
		System.out.println("===============================================");
		log.info("{}", service.read(1000));
		System.out.println("===============================================");
		service.change(10);
		log.info("{}", service.read(1000));
		System.out.println("===============================================");
		service.change(1000);
		log.info("{}", service.read(1000));
	}
}
