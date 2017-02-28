import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalcTest {

	int a, b, c;
	Calc test;
	
	@Before
	public void setUp() throws Exception {
		 a = 12;
		 b =  6;
		 c = 0;
		 test = new Calc();
	}

	@After
	public void tearDown() throws Exception {
	test = null;
	}

	@Test
	public void testAddPos() {
		int result = test.add(a, b);
		assertEquals(18,result);
	}
	@Test
	public void testAddZero(){
		assertEquals(12, test.add(a, c));
	}
	@Test
	public void testAddNegative(){
		assertEquals(-12, test.add(-22, 10));
	}

	@Test
	public void testSubtract() {
		int result = test.subtract(a,b);
		assertEquals(6, result);
	}
	
	@Test
	public void testSubtractZero(){
		assertEquals(12, test.subtract(a, c));
	}
	
	@Test
	public void testSubtractNegative(){
		assertEquals(18, test.subtract(a, -b));
	}

	@Test
	public void testMultiply() {
		assertEquals(72, test.multiply(a, b));
	}
	
	@Test
	public void testMultiplyZero() {
		assertEquals(0,test.multiply(c, b));
	}
	
	@Test
	public void testMultiplyNegative() {
		assertEquals(-72,test.multiply(a, -b));
	}

	@Test
	public void testDivide() {
		assertEquals(2.0, test.divide(a, b), 0);
	}
	
	@Test
	public void testDivideZero() {
		assertEquals(0, test.divide(c, a), 0);
	}
	
	@Test
	public void testDivideNegative() {
		assertEquals(-0.5, test.divide(b, -a), 0);
	}

}
