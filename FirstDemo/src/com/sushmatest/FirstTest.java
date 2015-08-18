package com.sushmatest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sushma.First;

public class FirstTest {
	First f;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Memory");	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 f=new First();
		 System.out.println("Memory Created");
	}

	@After
	public void tearDown() throws Exception {
		f=null;
		 System.out.println("Memory lost");
	}

	@Test(expected=ArithmeticException.class)
	
	public void testAdd() {
		//fail("Not yet implemented");
		
		assertEquals(7, f.add(2,5));
		
	}
	@Test(timeout=1000)
	public void testSub() {
		//fail("Not yet implemented");
		
		assertEquals(2, f.sub(5,3));
	}
}
