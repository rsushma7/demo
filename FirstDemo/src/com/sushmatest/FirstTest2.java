package com.sushmatest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sushma.First;

public class FirstTest2 {
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

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		assertEquals(7, f.add(2,5));
		
	}
	@Test
	public void testSub() {
		//fail("Not yet implemented");
		
		assertEquals(5, f.sub(15,10));
	}
}
