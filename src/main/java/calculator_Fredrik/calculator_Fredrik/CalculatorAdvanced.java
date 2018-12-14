/**
 * 
 */
package calculator_Fredrik.calculator_Fredrik;

/**
 * @author fredd
 * 
 */
public class CalculatorAdvanced implements CalculatorAdvancedOperationsInterface {

	/**
	 * Takes the Square root out of a double and returns the value. There is a if
	 * statement in the main method stops negative numbers.
	 */
	public double rotenUr(double mittTalA) {
		return Math.sqrt(mittTalA);

	}

	/**
	 * Takes a double and multiples it by PI and returns the value.
	 */
	public double gångerPI(double mittTalA) {
		return Math.PI * (mittTalA);

	}

	/**
	 * Takes a double and elevates it by 2 and returns the value.
	 */
	public double potens2(double mittTalA) {
		return Math.pow(mittTalA, 2);

	}

	/**
	 * Takes a double makes it in to a radian and multiples it with the sin value
	 * and returns the value.
	 */
	public double sin(double mittTalA) {
		return Math.sin(Math.toRadians(mittTalA));
	}

	/**
	 * Takes a double makes it in to a randian and multiples it with the cos value
	 * and returns the value.
	 */
	public double cos(double mittTalA) {
		return Math.cos(Math.toRadians(mittTalA));
	}

	/**
	 * Takes a double makes it in to a radian and multiples it with the tan value
	 * and returns the value.
	 */
	public double tan(double mittTalA) {
		return Math.tan(Math.toRadians(mittTalA));
	}

}
