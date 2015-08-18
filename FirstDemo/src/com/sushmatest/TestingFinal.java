package com.sushmatest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestingFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=JUnitCore.runClasses(ComboTest.class);
		for(Failure f:r.getFailures())
		{
			System.out.println(" "+f.toString());
		}
	 System.out.println(" "+r.wasSuccessful());
	}

}
