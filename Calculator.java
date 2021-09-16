
import java.util.Arrays;

/**
 * @author Cordell Bonnieux
 * @since September 16 2021
 *
 *         A simple class that contains many common methods used for performing
 *         various computations. These methods may or may not be correct. We
 *         should add a test class to check the validity of these methods.
 */
public class Calculator {
	
	/**
	 * This method returns the division remainder of two integers.
	 * @param a an integer, the numerator
	 * @param b an integer, the denominator
	 * @return an integer, the division remainder of the two parameters a and b
	 */
	public static int remainder(int a, int b) {
		return a % b;
	}

	/**
	 * This method returns the sum of two integers.
	 * @param a an integer, to be added
	 * @param b an integer, to be added
	 * @return an integer, the sum of a and b
	 */
	public static double add(double a, double b) {
		return a + b;
	}

	/**
	 * This method returns the product of two doubles
	 * @param a A double to be multiplied 
	 * @param b A double to be multiplied
	 * @return A double, the product of the two parameters
	 */
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	/**
	 * This method returns the difference of two doubles
	 * @param a A double to be subtracted from
	 * @param b A double to subtract from the the first parameter
	 * @return the difference of the two inetegers
	 */
	public static double subtract(double a, double b) {
		return a - b;
	}

	/**
	 * This method returns the quotient, of two doubles.
	 * @param a, A double to be divided from
	 * @param b, A double to divide from a
	 * @return a double, which is the quotient of the two parameters
	 */
	public static double divide(double a, double b) {
		return a / b;
	}

	/**
	 * This method returns average of all doubles it receives, by
	 * adding all values together and dividing them by the number of values.
	 * @param values A variable amount of double values
	 * @return A double, which is the average of all values (parameters)
	 */
	public static int average(double... values) {
		int sum = 0;
		for (double n : values) {
			sum += n;
		}
		return sum / values.length;
	}
	
	/**
	 * calculate arithmetic median
	 * the median of a finite list of numbers can be found
	 * by arranging all the numbers from smallest to greatest.
	 * If there is an odd number of numbers, the middle one is
	 * picked. If there is an even number of observations, then
	 * there is no single middle value; the median is then usually
	 * defined to be the mean of the two middle values
	 * @param values A variable amount of doubles
	 * @return the median value (a double) from the list of parameters (values)
	 */
	public static double median(double... values) {
		Arrays.sort(values);
		return values[values.length / 2];

	}

	/**
	 * This method takes in a variable length of double values and returns 
	 * the highest number among them (as a double).
	 * @param values A variable amount of double values
	 * @return A double, which is the highest value from the values parameter
	 */
	public static double max(double... values) {
		double max = 0;
		if (values.length > 0 || values != null) {
			max = values[0];
			for (int i = 1; i < values.length; i++) {
				if (values[i] > max)
					max = values[i];
			}
		}
		return max;
	}
	
	/**
	 * This method takes in a variable amount of double values and
	 * returns the smallest number among them (as a double).
	 * @param values A variable amount of doubles 
	 * @return the smallest double from the values parameter
	 */
	public static double min(double... values) {
		double min = 0;
		if (values.length > 0 || values != null) {
			min = values[0];
			for (int i = 1; i < values.length; i++) {
				if (values[i] < min)
					min = values[i];
			}
		}
		return min;
	}

}
