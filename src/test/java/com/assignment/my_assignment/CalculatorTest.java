package com.assignment.my_assignment;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
	Calculator c = new Calculator();

	@Test
	public final void testSum() {
		//fail("Not yet implemented"); // TODO
		assertEquals(20,c.sum(15, 5));
	}

	@Test
	public final void testSubtract() {
		//fail("Not yet implemented"); // TODO
		assertEquals(10,c.subtract(15, 5));
	}

	@Test
	public final void testMultiply() {
		//fail("Not yet implemented"); // TODO
		assertEquals(75,c.multiply(15, 5));
	}

	
	@Test
	public final void testDivide() {
		//fail("Not yet implemented"); // TODO
		assertEquals(3,c.divide(15, 5));
	}

}
