package com.StringProblems;

public class PalindromString {
public static void main(String[] args) {
String s = "harsha";
String s1 ="";
int j= s.length();

for(int i =j-1 ;i>=0;i--)
{
	s1 = s1+s.charAt(i);
	System.out.println(s1);
}
System.out.println(s1);

if(s.equals(s1))
	{System.out.println("its a palindrome number");}

else
	{System.out.println("not a palindrome number");}
		}
	
			}
	
	

