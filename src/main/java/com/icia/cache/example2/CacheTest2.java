package com.icia.cache.example2;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import com.icia.cache.example1.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class CacheTest2 {
	@Autowired
	private CacheService2 service;
	@Test
	public void testA() {
		System.out.println("========================================");
		service.list();
		System.out.println("========================================");
		service.list();
		System.out.println("========================================");
		service.insert(new Product(3, "제피러스"));
		service.list();
		System.out.println("========================================");
		service.delete(3);
		service.list();
		System.out.println("========================================");
		service.list();
		System.out.println("========================================");
		service.list();
		System.out.println("========================================");
	}
}

