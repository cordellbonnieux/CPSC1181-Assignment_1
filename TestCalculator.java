import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * 
 * A class for testing the methods of the Calculator class behave
 * as expected.
 * See: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * For more JUnit Assertion Statements
 */
class TestCalculator {

	@Test
	@DisplayName("Modulus remainder")
	void testRemainder() {
		assertEquals(0, Calculator.remainder(10, 2));
		assertEquals(3, Calculator.remainder(7, 4));	
		assertEquals(0, Calculator.remainder(0, 99));
		assertEquals(0, Calculator.remainder(-4, 2));
		assertEquals(-2, Calculator.remainder(-12, 5));
		assertEquals(1, Calculator.remainder(99, 7));
		assertEquals(8, Calculator.remainder(8, 67));
        Exception remainderDenomZero = assertThrows(ArithmeticException.class, () ->
        Calculator.remainder(24, 0));        
        assertEquals("/ by zero", remainderDenomZero.getMessage());
	}

	@Test
	@DisplayName("Addition")
	void testAdd() {
		assertEquals(15, Calculator.add(10, 5));
		assertEquals(16, Calculator.add(37, -21));
		assertEquals(4, Calculator.add(2, 2));
		assertEquals(3, Calculator.add(0, 3));
		assertEquals(0, Calculator.add(200, -200));
		assertEquals(0, Calculator.add(0, 0));
		assertEquals(0.05, Calculator.add(0.01, 0.04));
		assertEquals(-0.8, Calculator.add(-0.4, -0.4));
	}

	@Test
	@DisplayName("Multiplication")
	void testMultiply() {
		assertEquals(100, Calculator.multiply(10, 10));
		assertEquals(-72, Calculator.multiply(24, -3));
		assertEquals(16.5, Calculator.multiply(3, 5.5));
		assertEquals(18.4, Calculator.multiply(2.3, 8));
		assertEquals(277.2, Calculator.multiply(-66, -4.2));
		assertEquals(-5920.5014, Calculator.multiply(-88.234, 67.1), 0.01);
		assertEquals(0, Calculator.multiply(0, 0));
		assertEquals(0, Calculator.multiply(0, 84.5));
		assertEquals(0, Calculator.multiply(0, 93));
	}

	@Test
	@DisplayName("Subtraction")
	void testSubtract() {	
		assertEquals(7, Calculator.subtract(10, 3));
		assertEquals(-13, Calculator.subtract(-10, 3));
		assertEquals(-30, Calculator.subtract(-6, 24));
		assertEquals(0, Calculator.subtract(-4, -4));
		assertEquals(-4, Calculator.subtract(0, 4));
		assertEquals(0, Calculator.subtract(10, 10));
		assertEquals(-0.997, Calculator.subtract(0.003, 1));
		assertEquals(4, Calculator.subtract(28.2, 24.2));
		assertEquals(3.68, Calculator.subtract(3.34, -0.34),0.01);
	}

	@Test
	@DisplayName("Division")
	void testDivide() {
		assertEquals(2, Calculator.divide(10, 5));
		assertEquals(1, Calculator.divide(-2, -2));
		assertEquals(-13, Calculator.divide(-26, 2));
		assertEquals(-10, Calculator.divide(30, -3));
		assertEquals(0, Calculator.divide(0, 24));
		assertEquals(11, Calculator.divide(24.2, 2.2), 0.001);
		assertEquals(-11.1, Calculator.divide(33.3, -3), 0.001);
		assertEquals(3, Calculator.divide(-99, -33));
		
		// test for unique cases
		//Double.NEGATIVE_INFINITY
		assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(93, 0));
		assertEquals(Double.NaN, Calculator.divide(0, 0));
		assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(33, -0));
	}

	@Test
	@DisplayName("Find the average")
	void testAverage() {
		assertEquals(4, Calculator.average(1, 2, 3, 4, 5, 6, 7));
		assertEquals(111, Calculator.average(10.2, 6.3, 23.9, 99, 420.1), 0.1);
		assertEquals(25_620, Calculator.average(123, 456, 789, 101112), 0.1);
		assertEquals(-17, Calculator.average(-66, -17, 40, -69,25), 0.1);
		assertEquals(0, Calculator.average(0, 1, 0, 0), 0.1);
		
		// test for null		
        Exception testNull = assertThrows(NullPointerException.class, () ->
        Calculator.average(null));
        assertEquals(null, testNull.getMessage());
	}


	@Test
	@DisplayName("Find the median")
	void testMedian() {
		assertEquals(3, Calculator.median(1, 2, 3, 4, 5));
		assertEquals(11.1, Calculator.median(12, 74, 3, 0.1, 10.2, 28.2), 0.01);
		assertEquals(23.3, Calculator.median(88, 0, 23.3, 4.9, 0.0, 29, 74));
		assertEquals(53.435, Calculator.median(44.4, 29.9, 62.47, 81.1), 0.01);
		assertEquals(11.4, Calculator.median(23.1, -14.7, -0.3, 25.2, 900, -14.2), 0.01);
		assertEquals(-22.1, Calculator.median(-22.1, -13, -88.2, -1.1, -35));

		// test for null
        Exception testNull = assertThrows(NullPointerException.class, () ->
        Calculator.median(null));
        assertEquals(null, testNull.getMessage());
	}

	@Test
	@DisplayName("Find the maximum")
	void testMax() {
		assertEquals(87, Calculator.max(69, 7, 42, 12, 87, 25));
		assertEquals(7, Calculator.max(-69, -72, -421, -8698, 7));
		assertEquals(420, Calculator.max(420, 0, 0, 0, 0, -430, 84));
		assertEquals(0.5, Calculator.max(0.0, 0, 0.1, 0.5, -0.3, -0.9));
		assertEquals(-0.9, Calculator.max(-211.3, -90, -320.3, -44.2, -0.9));

		// test for null
        Exception testNull = assertThrows(NullPointerException.class, () ->
        Calculator.median(null));
        assertEquals(null, testNull.getMessage());
	}
	
	@Test
	@DisplayName("Find the minimum")
	void testMin() {
		assertEquals(-10001, Calculator.min(9, 24, 0, -23, 900, -10001));
		assertEquals(-0.2, Calculator.min(0.0, 0.1, -0.1, -0.2, 0.2));
		assertEquals(1, Calculator.min(1, 2, 3, 44, 55, 66));
		assertEquals(0, Calculator.min(0, 0, 0, 0, 0.1));

		// test for null
        Exception testNull = assertThrows(NullPointerException.class, () ->
        Calculator.median(null));
        assertEquals(null, testNull.getMessage());
	}
}