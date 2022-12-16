package junit_example;

import org.junit.jupiter.api.Test;

class Junit {
int x=-12;
	@Test
	void test() {
		assert(x<0):"it is not a positive number"+x;
	}

}
