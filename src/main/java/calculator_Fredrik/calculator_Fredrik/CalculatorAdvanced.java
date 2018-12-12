/**
 * 
 */
package calculator_Fredrik.calculator_Fredrik;

/**
 * @author fredd
 * 
 */
public class CalculatorAdvanced implements CalculatorAdvancedOperationsInterface {
	private double mittTalA = 0.0;

	public double getmittTalA() {
		return mittTalA;
	}

	public void setmittTalA(double mittTalA) {
		this.mittTalA = mittTalA;
	}

	public double rotenUr(double mittTalA) {
		return Math.sqrt(mittTalA);

	}

	public double kubenUr(double mittTalA) {
		return Math.cbrt(mittTalA);

	}

	public double potens2(double mittTalA) {
		return Math.pow(mittTalA, 2);

	}

	public double sin(double mittTalA) {
		return Math.sin(mittTalA);
	}

	public double cos(double mittTalA) {
		// setklart(Math.cos(mittTalA));
		return Math.cos(mittTalA);
	}

	public double tan(double mittTalA) {
		return Math.tan(mittTalA);
	}

}
