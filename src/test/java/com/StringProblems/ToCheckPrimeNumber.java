package com.StringProblems;
import java.util.HashSet;
import java.util.Set;

public class ToCheckPrimeNumber {

	public static void main(String[] args) {
	
	//int num = 121;
	boolean flag = false;
	int count=0;
	///List<> s=new int[25];
	
		for(int h=2;h<=25;h++)
			{
			for(int i =2;i<=h/2;i++)
			{
				if(h%i==0)
				{
					flag=true;			
				}
		
			}

			if(flag==true)
				{System.out.println(h+" is not a prime number");}
	
			else
			{
				System.out.println(h +" is a prime number");
		
			}
		}



			}
				}