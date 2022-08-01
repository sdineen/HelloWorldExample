package test.examples;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TemperatureConverterTest {
	
	//class under test
	static TemperatureConverter temperatureConverter;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		temperatureConverter = new TemperatureConverter();
	}

	@Test
	public void testConvertFahrenheitToCelsius() {
		assertEquals(37.777, temperatureConverter.convertFahrenheitToCelsius(100), 0.001);
	}

	@Test
	public void testConvertCelsiusToFahrenheit() {
		assertTrue(temperatureConverter.convertCelsiusToFahrenheit(100)== 212);
	}

	@Test
	public void testConvertKelvinToCelsius() {
		assertEquals(400, temperatureConverter.convertKelvinToCelsius(673),0);
	}

	@Test
	public void testConvertCelsiusToKelvin() {
		assertEquals(773,temperatureConverter.convertCelsiusToKelvin(500),0);
	}

	@Test
	public void testConvertKelvinToFahrenheit() {
		assertEquals(-279, temperatureConverter.convertKelvinToFahrenheit(100),1);
	}

	@Ignore
	@Test
	public void testConvertFahrenheitToKelvin() {
		fail("Not yet implemented");
	}

}
