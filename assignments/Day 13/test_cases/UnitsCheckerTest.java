package test_cases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.UnitsChecker;

public class UnitsCheckerTest {
	
	UnitsChecker check = null;
	
	@Before
	public void setObject() {
		check = new UnitsChecker();
	}
	
	@Test
	public void centimeterIsEqualsCentimeter() {
		assertTrue(check.isEquals("1 cm", "1 cm"));
		
	}
	
	@Test
	public void meterIsEqualsCentimeter() {
		assertTrue(check.isEquals("1 m", "100 cm"));
		
	}
	
	@Test
	public void centimeterIsEqualsKilometer() {
		assertTrue(check.isEquals("100 cm", "0.001 km"));
		
	}
	
	@Test
	public void gramIsEqualsgrams() {
		assertTrue(check.isEquals("1 g", "1 g"));
		
	}
	
	@Test
	public void kilogramIsEqualsgrams() {
		assertTrue(check.isEquals("0.1 kg", "100 g"));
		
	}
	
	@Test
	public void celsiusIsEqualsFahrenheit() {
		assertTrue(check.isEquals("0 C", "32 F"));
		
	}
	
	@Test
	public void kelvinIsEqualsCelsius() {
		assertTrue(check.isEquals("0 K", "-273.15 C"));
		
	}
	
	@Test
	public void meterPlusCentimeter() {
		assertEquals(2, (int)check.addition("1 m", "100 cm"));
	}
	
	@Test
	public void centimeterPlusKilometer() {
		assertEquals(100200, (int)check.addition("200 cm", "1 km"));
	}
	
	@Test
	public void gramPlusKilogram() {
		assertEquals(1010, (int)check.addition("10 g", "1 kg"));
	}
	
	@Test
	public void meterMinusCentimeter() {
		assertTrue(0.5 == check.subtraction("1 m", "50 cm"));
	}
	
	@Test
	public void kilogramMinusGram() {
		assertTrue(1 == check.subtraction("1.5 kg", "500 g"));
	}
	
}
