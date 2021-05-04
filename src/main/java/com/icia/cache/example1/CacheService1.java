package com.icia.cache.example1;

import java.util.*;

import org.springframework.cache.annotation.*;
import org.springframework.stereotype.*;

import lombok.*;

@AllArgsConstructor
@Service
public class CacheService1 {
	@Cacheable(value="view", key ="#pno")
	public Product read(int pno) {
		System.out.println("상품정보 읽기");
		return new Product(pno, "예제 상품");
	}
	
	@CacheEvict(value="view")
	public void change(int pno) {
		System.out.println("상품정보 변경");
	}
}
