package junit_example;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
class Calculator {

	@SuppressWarnings("deprecation")
	@Test
	void test() {
		assertEquals(20,Calculatur.add(10, 10));
		assertEquals(-10,Calculatur.sub(10, 20));
		assertEquals(200,Calculatur.mul(10, 20));
		assertEquals(01.00,Calculatur.div(20, 20));
	}

}
