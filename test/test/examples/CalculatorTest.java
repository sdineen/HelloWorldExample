package test.examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator1;
	
	@Test
	public void objectsAreSameTest() {
	    Object obj1 = "alpha beta";
	    Object obj2 = obj1;
	    assertSame("Expected: Both objects are the same",obj1, obj2);
	}

	@Test
	public void objectsAreNotSame() {
	    Object obj1 = "alpha beta";
	    Object obj2 = "charlie delta";
	    assertNotSame("Expected: Both objects are the same",obj1, obj2);
	}
	
	@Test
	public void testAdd() {
		
		int result = calculator1.add(5, 6);
		Assert.assertNotNull(calculator1);
		Assert.assertEquals(11,result);
	}
	
	@Test
	public void testDivide() {
		Calculator calculator1 = new Calculator();
		double result = calculator1.divide(10,3);
		assertEquals("Expected: 10/3 is 3.333",3.333333333333, result, 1e-5);
	}
	
	
	@BeforeClass
	public static void setup() {
	    System.out.println("Before class");
	}
	
	@AfterClass
	public static void teardown() {
	    System.out.println("After class");
	}
	
	@Before
	public void init() {
	    System.out.println("Before test");
	    calculator1 = new Calculator();
	}
	
	@After
	public void reset() {
	    System.out.println("After test");
	}

	@Test
	public void test1() {
	    System.out.println("Test 1");
	}

	@Test
	public void test2() {
	    System.out.println("Test 2");
	}
}
