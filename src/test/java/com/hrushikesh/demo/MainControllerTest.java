package com.hrushikesh.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class MainControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	void test() {
		ResponseEntity<String> responseEntity = this.testRestTemplate.getForEntity("/", String.class);
		
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	void test1() {
		ResponseEntity<String> responseEntity = this.testRestTemplate.getForEntity("/", String.class);
		
		assertThat(responseEntity.getBody()).containsIgnoringCase("jenkins");
	}
	
	@Test
	void test2() {
		ResponseEntity<String> responseEntity = this.testRestTemplate.getForEntity("/link", String.class);
		
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	
	@Test
	void test3() {
		ResponseEntity<String> responseEntity = this.testRestTemplate.getForEntity("/link", String.class);
		
		assertThat(responseEntity.getBody()).containsIgnoringCase("link");
	}
}
