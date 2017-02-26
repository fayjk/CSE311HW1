import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalcTest {

	int a, b;
	
	@Before
	public void setUp() throws Exception {
		 a = 12;
		 b =  6;
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testAdd() {
		Calc one = new Calc();
		int result = one.add(a, b);
		assertEquals(18,result);
	}

	@Test
	public void testSubtract() {
		Calc two = new Calc();
		int result = two.subtract(a,b);
		assertEquals(6, result);
	}

	@Test
	public void testMultiply() {
		Calc three = new Calc();
		int result = three.multiply(a, b);
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}