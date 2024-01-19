// Engineering Calculator
/*
	Class EngineeringCalci contains function for different mathematical calculation
*/

public class EngineeringCalci {
	/*
	 * Function will take argument as two Integer number then
	 * Add this Number and return result in Integer.
	 */
	public static int additionTwoNumber(int num1, int num2) {
		int result; // Initialize variable result to store result
		result = num1 + num2; // Adding two number
		return result; // Return result of operation perform
	}

	/*
	 * Function will take argument as two Integer number then
	 * Subtract num2 from num1 and retern result in Integer.
	 */
	public static int subtractionTwoNumber(int num1, int num2) {
		int result; // Initialize variable result to store result
		result = num1 - num2; // Subtract num2 from num1
		return result; // Return result of operation performed
	}

	/*
	 * Function will take argument as two Integer number then
	 * Multiply these Number and return result in Integer.
	 */
	public static int mulitplyTwoNumber(int num1, int num2) {
		int result; // Initialize variable result to store result
		result = num1 * num2; // Mulitplying two number
		return result; // Return result of operation performed
	}

	/*
	 * Function will take argument as two Integer number then
	 * Divide num1 by num2 and return result in Integer.
	 */
	public static int divideTwoNumber(int num1, int num2) {
		int result; // Initialize variable result to store result
		result = num1 / num2; // Divide num1 by num2
		return result; // Return result of operation performed
	}

	/*
	 * Function will take argument as base and index then
	 * multiply base value itself for index value of times and return in Integer.
	 */
	public static int power(int base, int index) {
		int result = 1; // Initialize varibable result = 1 because 1 Mulitply to any number will be that
						// number.
		for (int i = 1; i <= index; i++) { // Loop iterate for index value of times
			result = result * base; // Mulitply result and base value for each iteration
		}
		return result; // Return result of operation performed.
	}

	/*
	 * Function will take argument as value and percent then
	 * calculate percentage for given value and return result.
	 */
	public static int percentage(int value, int percent) {
		int result; // Initialize variavle result to store result
		result = (value * percent) / 100; // Calculate percentage by dividing percent by 100 and multiply result to
											// value
		return result; // Return result of operation performed.
	}

	public static int factorial(int value) {
		int fact = 1;
		for (int i = 1; i <= value; i++) {
			fact = fact * 1;
		}
		return fact; // Return result of operation performed.
	}
}
