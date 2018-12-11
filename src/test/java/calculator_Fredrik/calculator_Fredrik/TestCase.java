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
	KalkyLekt Kalk = new KalkyLekt();
	public static final Logger Log = Logger.getLogger(KalkyLekt.class.getName());
//	@Test
//	public void test1() {
//		double oracle = 0;
//		oracle = 2.0 + 2.0;
//		assertEquals(Kalk.addi(2, 2), oracle, 0);
//	}
	@Test
	public void test1() {
		double oracle = 0;
		oracle = 3.0 + 5.0;
		Log.info("Testar detta " + oracle);
		assertEquals(Kalk.addi(3, 5), oracle, 0);
	}
	@Test
	public void test10gånger() {
		double oracle = 0;
		double randomNum1 = 0.0;
		double randomNum2 = 0.0;
		Random zrandom = new Random();
		for (int i = 0; i < 10; i++) {
			randomNum1 = zrandom.nextDouble() * 10;
			randomNum2 = zrandom.nextDouble() * 10;
			oracle = randomNum1 + randomNum2;
			assertEquals(Kalk.addi(randomNum1, randomNum2), oracle, 0);
			Log.info("Testar att Random " + randomNum1 + " och " + randomNum2 +" är samma som " + oracle);
		}
	}
}

