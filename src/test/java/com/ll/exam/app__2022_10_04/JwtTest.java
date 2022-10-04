package com.ll.exam.app__2022_10_04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class JwtTest {

	@Value("${custom.jwt.secretKey}")
	private String secretKey;



	@Test
	@DisplayName("secretKey가 존재한다.")
	void t1() {
		assertThat(secretKey).isNotNull();
	}

}


