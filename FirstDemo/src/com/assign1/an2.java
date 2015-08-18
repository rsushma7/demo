package com.assign1;

import java.util.Arrays;

public class an2 {
	public int median(int[] args)
	{
		int i=0;
		int n=args.length;
		int [] array=new int[n];
		while(i<n)
		{
		array[i]=args[i];
		i++;
		}
	   int [] array1=new int[n];
		
		array1[0]=array1[n-1];
		while(i<n)
		{
		array1[i+1]=array[i];
		i++;
		}
		Arrays.sort(array);
		for(int k=0;k<n;k++)
		{
			System.out.println(array[k]);
		}
	
		if(n%2==0)
		{
			return (array[(n/2)-1]+array[(n/2)/2]);
		}
		else
			return array[n/2];
	}
	
	
	
	public static void main(String[] args) {
	}
}
