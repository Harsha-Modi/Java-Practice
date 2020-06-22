package com.StringProblems;

public class TocheckPalindromeString {

	public static void main(String[] args) {
		String s = "abccba";
		String rev="";
	
		int length=s.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		  System.out.println("its a palindrome string");
	
	    else
		   System.out.println("its not a palindrome string");	
}
}
 