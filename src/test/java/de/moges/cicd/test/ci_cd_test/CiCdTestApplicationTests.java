package de.moges.cicd.test.ci_cd_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiCdTestApplicationTests {

	@Test
	void contextLoads() {
	}

	void addFailingtest() {
		assertEquals(1,2);
	}
}
