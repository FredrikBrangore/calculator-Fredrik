package calculator_Fredrik.calculator_Fredrik;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

/**
 * 
 * @author fredde
 *
 */
public class TestCase {
	CalculatorAdvanced KalkA = new CalculatorAdvanced();
	CalculatorBasic KalkB = new CalculatorBasic();
	public static final Logger Log = Logger.getLogger(MainKalk.class.getName());
	double oracle = 0;
	double randomNum1 = 0.0;
	double randomNum2 = 0.0;
	Random zrandom = new Random();

	@Test
	public void testGet1B50() {
		for (int i = 0; i < 10; i++) {
			KalkB.setmittTal1(0.0);
			assertEquals(0.0, KalkB.getmittTal1(), 0);
			Log.info("Testar Set och GET mittTal1 värderna är samma som de ska vara.");
		}
	}

	@Test
	public void testGet2B50() {
		for (int i = 0; i < 10; i++) {
			KalkB.setmittTal2(0.0);
			assertEquals(0.0, KalkB.getmittTal2(), 0);
			Log.info("Testar Set och GET mittTal2 värderna är samma som de ska vara.");
		}
	}

	@Test
	public void testGetA50() {
		for (int i = 0; i < 10; i++) {
			KalkA.setmittTalA(0.0);
			assertEquals(0.0, KalkA.getmittTalA(), 0);
			Log.info("Testar Set och GET mittTalA värderna är samma som de ska vara.");
		}
	}

	@Test
	public void testPlus50() {
		for (int i = 0; i < 10; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			randomNum2 = zrandom.nextDouble() * 10;
			oracle = randomNum1 + randomNum2;
			assertEquals(KalkB.plus(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar PLUS av Random " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testMinus50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			randomNum2 = zrandom.nextDouble() * 10;
			oracle = randomNum1 - randomNum2;
			assertEquals(KalkB.minus(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar MINUS av Random " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testGånger50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			randomNum2 = zrandom.nextDouble() * 10;
			oracle = randomNum1 * randomNum2;
			assertEquals(KalkB.gånger(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar GÅNGER av Random " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testDelat50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			randomNum2 = zrandom.nextDouble() * 10;
			oracle = randomNum1 / randomNum2;
			assertEquals(KalkB.delat(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar DELAT av Random " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testRotenUr50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.sqrt(randomNum1);
			assertEquals(KalkA.rotenUr(randomNum1), oracle, 0);
			Log.info("Testar ROTENUR av Random " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void tesKubenUr50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.cbrt(randomNum1);
			assertEquals(KalkA.kubenUr(randomNum1), oracle, 0);
			Log.info("Testar KUBENUR av Random " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testPotens2z50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.pow(randomNum1, 2);
			assertEquals(KalkA.potens2(randomNum1), oracle, 0);
			Log.info("Testar POTENS av 2 på Random " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testCos50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.cos(randomNum1);
			assertEquals(KalkA.cos(randomNum1), oracle, 0);
			Log.info("Testar COS av Random " + randomNum1 + " är samma som " + oracle);
		}
	}

	@Test
	public void testSin50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.sin(randomNum1);
			assertEquals(KalkA.sin(randomNum1), oracle, 0);
			Log.info("Testar SIN av Random " + randomNum1 + " är samma som " + oracle);
		}
	}

	@Test
	public void testTan50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.tan(randomNum1);
			assertEquals(KalkA.tan(randomNum1), oracle, 0);
			Log.info("Testar TAN av Random " + randomNum1 + " är samma som " + oracle);
		}
	}
}
