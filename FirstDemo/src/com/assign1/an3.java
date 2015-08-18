package com.assign1;

public class an3 {

	public int imaginary(int[] s)throws ImaginaryNumberException
	{
		int a=s[0];
		int b=s[1];
		int c=s[2];
		if((b*b-4*a*c)<0)
		{
			return 0;
			//throw new ImaginaryNumberException("exception");
			
		}
		else
			return 1;
		
	}
	public static void main(String[] args) throws ImaginaryNumberException {
		/*an3 a=new an3();
		int b[]={1,2,3};
		a.imaginary(b);*/


	}

}
