package test_cases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import cls.Validate;

public class ValidateTest {
	
	Validate ipValid = null;
	
	@Before
	public void setObject() {
		ipValid = new Validate();
	}
	
	@Test
	public void addressTrue() {
		assertTrue(ipValid.validateIpv4Address("1.1.1.1"));
		assertTrue(ipValid.validateIpv4Address("192.168.1.1"));
		assertTrue(ipValid.validateIpv4Address("10.0.0.1"));
		assertTrue(ipValid.validateIpv4Address("127.0.0.1"));

	}
	
	@Test
	public void addressLengthLessFalse() {
		assertFalse(ipValid.validateIpv4Address("10.0.1"));
		assertFalse(ipValid.validateIpv4Address("10.22.1"));
		assertFalse(ipValid.validateIpv4Address("10.0.33"));
		
	}
	
	@Test
	public void addressEndZeroFalse() {
		assertFalse(ipValid.validateIpv4Address("0.0.0.0"));
		assertFalse(ipValid.validateIpv4Address("1.1.1.0"));
		assertFalse(ipValid.validateIpv4Address("10.0.12.0"));
		
	}
	
	@Test
	public void addressEndFalse() {
		assertFalse(ipValid.validateIpv4Address("255.255.255.255"));
		assertFalse(ipValid.validateIpv4Address("11.25.51.255"));
	}
	
	@Test
	public void addressNegativeFalse() {
		assertFalse(ipValid.validateIpv4Address("-2.1.300.7"));
		assertFalse(ipValid.validateIpv4Address("1.-22.1.300"));
		assertFalse(ipValid.validateIpv4Address("0.1.-30.79"));
		assertFalse(ipValid.validateIpv4Address("02.1.300.-7"));
		
	}
	
	@Test
	public void addressHigherFalse() {
		assertFalse(ipValid.validateIpv4Address("300.22.1.11"));
		assertFalse(ipValid.validateIpv4Address("0.322.1.10"));
		assertFalse(ipValid.validateIpv4Address("0.1.340.79"));
		assertFalse(ipValid.validateIpv4Address("02.1.130.557"));
		
	}
	

}
