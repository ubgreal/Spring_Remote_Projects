package com.example.springdeploy2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDeploy2ApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key,value)-> System.out.println(key + ": " + value));
	}

}
