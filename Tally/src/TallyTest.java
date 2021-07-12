import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TallyTest {

	Tally t;
	
	@Before
	public void setUp() {
		t = new Tally();
	}
	
	@Test
	public void testDefault() {
		int current = t.getTally();
		assertEquals(0, current);
	}

	@Test
	public void testInc() {
		t.inc();
		assertEquals(1, t.getTally());
	}
	
	@Test
	public void testIncInc() {
		t.inc();
		t.inc();
		assertEquals(2, t.getTally());
	}
	
	@Test
	public void testInc5() {
		t.inc(5);
		assertEquals(5, t.getTally());
	}
	
	@Test
	public void testIncNeg5() {
		t.inc(-5);
		assertEquals(-5, t.getTally());
		
	}
	
	@Test
	public void testMaxInt() {
		t.inc(Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, t.getTally());
	}
	

	
	@Test (expected = ArithmeticException.class)
	public void testMaxSafeInt() {
		t.inc(Integer.MAX_VALUE);
		t.safeInc();
	}
	
	@After
	public void tearDown() {
		
	}


}
