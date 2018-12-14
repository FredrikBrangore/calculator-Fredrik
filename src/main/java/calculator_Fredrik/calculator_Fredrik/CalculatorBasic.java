/**
 * 
 */
package calculator_Fredrik.calculator_Fredrik;

/**
 * @author fredd
 *
 */
public class CalculatorBasic implements CalculatorBasicOperationsInterface {

	/**
	 * Takes two doubles and adds them together and returns the value.
	 */
	public double plus(double mittTal1, double mittTal2) {
		return mittTal1 + mittTal2;

	}

	/**
	 * Takes two doubles and subtracts mittTal2 from mittTal1 and returns the value.
	 */
	public double minus(double mittTal1, double mittTal2) {
		return mittTal1 - mittTal2;
	}

	/**
	 * Takes two doubles and multiples them by each other and returns the value.
	 */
	public double gånger(double mittTal1, double mittTal2) {
		return mittTal1 * mittTal2;
	}

	/**
	 * Divides the doubles mittTall1 with mittTal2 and returns the value. There is a
	 * if statement in my main method stops dividing by 0.
	 */
	public double delat(double mittTal1, double mittTal2) {
		return mittTal1 / mittTal2;
	}

}
