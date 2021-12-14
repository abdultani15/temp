package edu.qc.seclass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

class BuggyClassTestSC1a {
	
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
	public void buggyMethod1Test() {
		assertEquals(2, newBuggyClass.buggyMethod1(4, 3));
	}

}
