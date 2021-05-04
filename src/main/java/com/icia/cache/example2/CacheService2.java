package com.icia.cache.example2;

import java.util.*;

import javax.annotation.*;

import org.springframework.cache.annotation.*;
import org.springframework.stereotype.*;

import com.icia.cache.example1.*;

@Service
public class CacheService2 {
	private List<Product> list;
	
	// 수명주기(life cycle) : 사람(태어나서 살다가 죽는다)
	// 수명주기 메소드 : 서블릿(init -> service(doGet/doPost) -> destory)
	// 스프링 빈 : @PostConstruct @PreDestroy
	// @PreDestroy
	@PostConstruct
	public void init() {
		list = new ArrayList<>();
		list.add(new Product(1000, "삼성 이온"));
		list.add(new Product(2000, "LG 그램"));
	}
	
	@Cacheable(value="getAll")
	public List<Product> list() {
		System.out.println("list 호출");
		return list;
	}
	
	@CacheEvict(value="getAll", allEntries = true)
	public List<Product> insert(Product p) {
		list.add(p);
		return list;
	}
	
	@CacheEvict(value="getAll", allEntries = true)
	public List<Product> delete(Integer  pno) {
		list.remove(pno);
		return list;
	}
}











