package edu.qc.seclass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

class BuggyClassTestSC2 {
	
	BuggyClass newBuggyClass;
	
	@Before
	public void setUp() {
		newBuggyClass = new BuggyClass();
	}
	
	@After
	public void tearDown() {
		newBuggyClass = null;
	}

	@Test
	public void buggyMethod2Test1() {
		assertEquals(2, newBuggyClass.buggyMethod2(3, 10));
	}
	
	@Test
	public void buggyMethod2Test2() {
		assertEquals(0, newBuggyClass.buggyMethod2(10, 8));
	}

}
