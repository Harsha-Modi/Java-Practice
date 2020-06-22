package com.StringProblems;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int j = 121212;
		
		int sum = 0;
		int i=j;
		while(i>0)
		{
			int LastDigit = i%10;
			System.out.println("last digit to add is: "+LastDigit );
			
			sum= (sum*10)+LastDigit;
			
			System.out.println("current number is: "+sum);
			i=i/10;
		}
System.out.println("Final number is: "+sum);

if(j==sum)
{System.out.println("its a palindrom number");
	}
else
{
	System.out.println("not a palindrom number");}
	}

}
