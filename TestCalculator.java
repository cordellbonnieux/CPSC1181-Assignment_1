import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * 
 * A class for testing the methods of the Calculator class behave
 * as expected.
 * See: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * For more JUnit Assertion Statements
 */
class TestCalculator {

	@Test
	void testRemainder() {
		assertEquals(0, Calculator.remainder(10, 2));
		assertEquals(3, Calculator.remainder(7, 4));
		assertEquals("ArithmeticException", Calculator.remainder(0, 0));
		assertEquals("ArithmeticException", Calculator.remainder(24, 0));
		assertEquals(0, Calculator.remainder(0, 99));
		assertEquals(0, Calculator.remainder(-4, 2));
		assertEquals(-2, Calculator.remainder(-12, 5));
		assertEquals(1, Calculator.remainder(99, 7));
	}

	@Test
	void testAdd() {
		assertEquals(15, Calculator.add(10, 5));
		assertEquals(16, Calculator.add(37,-21));
		assertEquals(4, Calculator.add(2,2));
		assertEquals(3, Calculator.add(0,3));
		assertEquals(0, Calculator.add(200,-200));
		assertEquals(0, Calculator.add(0,0));
		assertEquals(0.05, Calculator.add(0.01,0.04));
		assertEquals(-0.8, Calculator.add(-0.4,-0.4));
	}

	@Test
	void testMultiply() {
		// use the test that has a bit of leeway
		assertEquals(100, Calculator.multiply(10, 10));
		assertEquals(-72, Calculator.multiply(24, -3));
		assertEquals(16.5, Calculator.multiply(3, 5.5));
		assertEquals(18.4, Calculator.multiply(2.3, 8));
		assertEquals(277.2, Calculator.multiply(-66, -4.2));
		assertEquals(-5920.5014, Calculator.multiply(-88.234, 67.1));
		assertEquals(0, Calculator.multiply(0, 0));
		assertEquals(0, Calculator.multiply(0, 84));
		assertEquals(0, Calculator.multiply(0, 93));
	}

	@Test
	void testSubtract() {
		assertEquals(7, Calculator.subtract(10,3));
		assertEquals(-13, Calculator.subtract(-10,3));
		assertEquals(30, Calculator.subtract(-6,24));
		assertEquals(0, Calculator.subtract(-4,-4));
		assertEquals(-4, Calculator.subtract(0,4));
		assertEquals(0, Calculator.subtract(10,10));
		assertEquals(0.997, Calculator.subtract(0.003,1));
		assertEquals(4, Calculator.subtract(28.2,24.2));
		assertEquals(3.68, Calculator.subtract(3.34,-0.34));
	}

	@Test
	void testDivide() {
		// use the test that has a bit of leeway
		assertEquals(2, Calculator.divide(10,5));
		assertEquals(1, Calculator.divide(-2,-2));
		assertEquals(-13, Calculator.divide(-26,2));
		assertEquals(-10, Calculator.divide(30,-3));
		assertEquals(0, Calculator.divide(0,24));
		assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(93,0));
		assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(0,0));
		assertEquals(Double.NEGATIVE_INFINITY, Calculator.divide(33,-0));
		assertEquals(11, Calculator.divide(24.2,2.2));
		assertEquals(-11.1, Calculator.divide(33.3,-3));
		assertEquals(3, Calculator.divide(-99,-33));
	}

	@Test
	void testAverage() {
		// null == null
		// 1,2,3,4,5,6,7 == 4
		// 10,6,23,99,420 == 111.6
		// 123,456,789,101112 == 25 620
	}


	@Test
	void testMedian() {
		// test for null
	}

	@Test
	void testMax() {
		// test for null
	}
	
	@Test
	void testMin() {
		// test for null
	}
}