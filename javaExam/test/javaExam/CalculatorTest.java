package javaExam;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	Calculator cal = null;

	protected void setUp() throws Exception {
		super.setUp();
		cal = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		cal = null;
	}

	public void testSum() {
		int result = cal.sum(3, 5);
		assertEquals(8, result);
	}

}
