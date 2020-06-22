package com.StringProblems;
import java.util.Scanner;
public class CountNoOfVowelsInString {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] a=str.toCharArray();
		int count=0;
		int NoOfConsonents=0;
		for (char c : a) {
			switch(c)
			{
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
				count++;
			break;
			
			default:
				NoOfConsonents++;	
			break;
			}
		}
System.out.println("no of vowels :" +count);
System.out.println("no of consonents:"+NoOfConsonents);
	}
}
