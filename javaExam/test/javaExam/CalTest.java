package javaExam;

import static org.junit.Assert.*;

import org.junit.*;

public class CalTest {

	Calculator cal = null;

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		cal = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void sum() {
		int result = cal.sum(3, 5);
		assertEquals(8, result);
	}

}
