/**
 * 
 */
package calculator_Fredrik.calculator_Fredrik;

/**
 * @author fredd
 *
 */
public class CalculatorBasic implements CalculatorBasicOperationsInterface {
	private double mittTal1 = 0.0;
	private double mittTal2 = 0.0;

	public double getmittTal1() {
		return mittTal1;
	}

	public void setmittTal1(double mittTal1) {
		this.mittTal1 = mittTal1;
	}

	public double getmittTal2() {
		return mittTal2;
	}

	public void setmittTal2(double mittTal2) {
		this.mittTal2 = mittTal2;
	}

	public double plus(double mittTal1, double mittTal2) {
		return mittTal1 + mittTal2;

	}

	public double minus(double mittTal1, double mittTal2) {
		return mittTal1 - mittTal2;
	}

	public double gånger(double mittTal1, double mittTal2) {
		return mittTal1 * mittTal2;
	}

	public double delat(double mittTal1, double mittTal2) {
		return mittTal1 / mittTal2;
	}

}
