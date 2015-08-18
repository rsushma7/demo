package com.assign1Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.assign1.ImaginaryNumberException;
import com.assign1.an2;
import com.assign1.an3;

public class antest3 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test()throws ImaginaryNumberException{
		//fail("Not yet implemented");

		an3 e=new an3();
		int b[]={1,2,3};
		
		assertEquals(0,e.imaginary(b));
	}

}
