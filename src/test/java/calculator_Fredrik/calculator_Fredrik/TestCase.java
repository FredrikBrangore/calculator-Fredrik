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
	public void tesgångerPI50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.PI * (randomNum1);
			assertEquals(KalkA.gångerPI(randomNum1), oracle, 0);
			Log.info("Testar GångerPI av Random " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testPotens50() {
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
			oracle = Math.cos(Math.toRadians(randomNum1));
			assertEquals(KalkA.cos(randomNum1), oracle, 0);
			Log.info("Testar COS av Random " + randomNum1 + " är samma som " + oracle);
		}
	}

	@Test
	public void testSin50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.sin(Math.toRadians(randomNum1));
			assertEquals(KalkA.sin(randomNum1), oracle, 0);
			Log.info("Testar SIN av Random " + randomNum1 + " är samma som " + oracle);
		}
	}

	@Test
	public void testTan50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			oracle = Math.tan(Math.toRadians(randomNum1));
			assertEquals(KalkA.tan(randomNum1), oracle, 0);
			Log.info("Testar TAN av Random " + randomNum1 + " är samma som " + oracle);
		}
	}
	@Test
	public void testNegPlus50() {
		for (int i = 0; i < 10; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			randomNum2 = zrandom.nextDouble() * -10;
			oracle = randomNum1 + randomNum2;
			assertEquals(KalkB.plus(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar PLUS av Negativa Random " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testNegMinus50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			randomNum2 = zrandom.nextDouble() * -10;
			oracle = randomNum1 - randomNum2;
			assertEquals(KalkB.minus(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar MINUS av Negativa Random " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testNegativeGånger50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			randomNum2 = zrandom.nextDouble() * -10;
			oracle = randomNum1 * randomNum2;
			assertEquals(KalkB.gånger(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar GÅNGER av Negativa Random " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testNegDelat50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			randomNum2 = zrandom.nextDouble() * -10;
			oracle = randomNum1 / randomNum2;
			assertEquals(KalkB.delat(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar DELAT av Negativa Random " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testNegRotenUr50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			oracle = Math.sqrt(randomNum1);
			assertEquals(KalkA.rotenUr(randomNum1), oracle, 0);
			Log.info("Testar ROTENUR av Negativa Random " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void tesNegativegångerPI50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			oracle = Math.PI * (randomNum1);
			assertEquals(KalkA.gångerPI(randomNum1), oracle, 0);
			Log.info("Testar GångerPI av Negativa Random " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testNegPotens50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			oracle = Math.pow(randomNum1, 2);
			assertEquals(KalkA.potens2(randomNum1), oracle, 0);
			Log.info("Testar POTENS av 2 på Negativa Random " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void testNegCos50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			oracle = Math.cos(Math.toRadians(randomNum1));
			assertEquals(KalkA.cos(randomNum1), oracle, 0);
			Log.info("Testar COS av Negativa Random " + randomNum1 + " är samma som " + oracle);
		}
	}

	@Test
	public void testNegSin50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			oracle = Math.sin(Math.toRadians(randomNum1));
			assertEquals(KalkA.sin(randomNum1), oracle, 0);
			Log.info("Testar SIN av Negativa Random " + randomNum1 + " är samma som " + oracle);
		}
	}

	@Test
	public void testNegTan50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = zrandom.nextDouble() * -10;
			oracle = Math.tan(Math.toRadians(randomNum1));
			assertEquals(KalkA.tan(randomNum1), oracle, 0);
			Log.info("Testar TAN av Negativa Random " + randomNum1 + " är samma som " + oracle);
		}
	}
	@Test
	public void test0Plus50() {
		for (int i = 0; i < 10; i++) {
			randomNum1 = 0;
			randomNum2 = 0;
			oracle = randomNum1 + randomNum2;
			assertEquals(KalkB.plus(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar PLUS av " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void test0Minus50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			randomNum2 = 0;
			oracle = randomNum1 - randomNum2;
			assertEquals(KalkB.minus(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar MINUS av " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void test0Gånger50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			randomNum2 = 0;
			oracle = randomNum1 * randomNum2;
			assertEquals(KalkB.gånger(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar GÅNGER av " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void test0Delat50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			randomNum2 = 0;
			oracle = randomNum1 / randomNum2;
			assertEquals(KalkB.delat(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar DELAT av " + randomNum1 + " och " + randomNum2 + " är samma som: " + oracle);
		}
	}

	@Test
	public void test0RotenUr50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			oracle = Math.sqrt(randomNum1);
			assertEquals(KalkA.rotenUr(randomNum1), oracle, 0);
			Log.info("Testar ROTENUR av " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void tes0gångerPI50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			oracle = Math.PI * (randomNum1);
			assertEquals(KalkA.gångerPI(randomNum1), oracle, 0);
			Log.info("Testar GångerPI av " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void test0Potens50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			oracle = Math.pow(randomNum1, 2);
			assertEquals(KalkA.potens2(randomNum1), oracle, 0);
			Log.info("Testar POTENS av 2 på " + randomNum1 + " är samma som: " + oracle);
		}
	}

	@Test
	public void test0Cos50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			oracle = Math.cos(Math.toRadians(randomNum1));
			assertEquals(KalkA.cos(randomNum1), oracle, 0);
			Log.info("Testar COS av " + randomNum1 + " är samma som " + oracle);
		}
	}

	@Test
	public void test0Sin50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			oracle = Math.sin(Math.toRadians(randomNum1));
			assertEquals(KalkA.sin(randomNum1), oracle, 0);
			Log.info("Testar SIN av " + randomNum1 + " är samma som " + oracle);
		}
	}

	@Test
	public void test0Tan50() {
		for (int i = 0; i < 50; i++) {
			randomNum1 = 0;
			oracle = Math.tan(Math.toRadians(randomNum1));
			assertEquals(KalkA.tan(randomNum1), oracle, 0);
			Log.info("Testar TAN av " + randomNum1 + " är samma som " + oracle);
		}
	}
}
