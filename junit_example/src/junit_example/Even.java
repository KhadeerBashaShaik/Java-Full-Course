package junit_example;

import org.junit.jupiter.api.Test;

class Even {
int x=4;
	@Test
	void test() {
		assert(x%2==0):"it is not a even number: "+x;
	}

}  
