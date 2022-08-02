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
	
	@Test
	public void testAdd() {
		Calculator calculator1 = new Calculator();		
		int result = calculator1.add(5, 6);
		Assert.assertEquals(11,result);
	}
	
	@Test
	public void testDivide() {
		Calculator calculator1 = new Calculator();
		double result = calculator1.divide(10.0,3.0);
		assertEquals(3.333333333333, result, 1e-5);
	}

}
