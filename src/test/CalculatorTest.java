import static org.junit.Assert.*;

import org.junit.Test;

import com.github.javafaker.Faker;

import main.Calculator;


/**
 * @author exaw
 *
 */
public class CalculatorTest {

	/**
	 * Test method for {@link main.Calculator#somme(int, int)}.
	 */
	@Test
	public void testSomme() {
		Boolean isOk = true;
		
		Calculator calc = new Calculator();
		
		com.github.javafaker.Faker faker = new Faker();
		
		for (int i = 0; i < 10000; i++) {
			int a = faker.number().numberBetween(-100, 100);
			int b = faker.number().numberBetween(-100, 100);
			int result = 0;
			
			result = calc.somme(a, b);
			
			System.out.println("a = " + a + "; b = " + b);
			
			if ((a + b) != result) {
				isOk = false;
			}
		}
		
		assertTrue(isOk);
	}

	/**
	 * Test method for {@link main.Calculator#multiplie(int, int)}.
	 */
	@Test
	public void testMultiplie() {
		Calculator calc = new Calculator();
		
		int a = 7;
		int b = 5;
		int result = 0;
		
		result = calc.multiplie(a, b);
		
		assertEquals((a * b), result);
	}

	/**
	 * Test method for {@link main.Calculator#soustrait(int, int)}.
	 */
	@Test
	public void testSoustrait() {
		Calculator calc = new Calculator();
		
		int a = 7;
		int b = 5;
		int result = 0;
		
		result = calc.soustrait(a, b);
		
		assertEquals((a - b), result);
	}

	/**
	 * Test method for {@link main.Calculator#divise(int, int)}.
	 */
	@Test
	public void testDivise() {
		Calculator calc = new Calculator();
		
		int a = 7;
		int b = 5;
		int result = 0;
		
		result = calc.divise(a, b);
		
		assertEquals((a / b), result);
	}

}
