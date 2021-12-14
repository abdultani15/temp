package edu.qc.seclass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

class BuggyClassTestSC1b {
	
	BuggyClass newBuggyClass;
	
	@Before
	public void setUp() {
		newBuggyClass = new BuggyClass();
	}
	
	@After
	public void tearDown() {
		newBuggyClass = null;
	}

	@Test (expected = NullPointerException.class)
	public void buggyMethod1Test2() {
		assertEquals(2, newBuggyClass.buggyMethod1(10, 3));
	}

}
