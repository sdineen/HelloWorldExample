package test.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseFactorialTest {
	
	@Test
	public void reverseFactorial120() {
		ReverseFactorial reverseFactorial = new ReverseFactorial();
		int result = reverseFactorial.getValue(120);
		assertEquals(5, result);
	}
	
	@Test
	public void reverseFactorial479001600 () {
		ReverseFactorial reverseFactorial = new ReverseFactorial();
		int result = reverseFactorial.getValue(479001600);
		assertEquals(12, result);
	}

}

