

package com.assign1Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.assign1.an2;
import com.assign1.ex;
import com.sushma.First;

public class antest2 {
	an2 a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a=new an2();
		 System.out.println("Memory Created");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSub() {
		//fail("Not yet implemented");

		an2 e=new an2();
		int b[]={3,1,2,5,4};
		assertEquals(3, a.median(b));
	}

}
