package com.assign1Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.assign1.an1;
import com.sushma.First;

public class antest1 {
	an1 a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a=new an1();
		 System.out.println("Memory Created");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSub() {
		//fail("Not yet implemented");
		int []b={100,-1,-3};
		assertEquals(100, a.large(b));
	}

}
