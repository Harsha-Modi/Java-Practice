package com.StringProblems;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=0,c=1;
		
		for(int i=1;i<=8;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}	
}


