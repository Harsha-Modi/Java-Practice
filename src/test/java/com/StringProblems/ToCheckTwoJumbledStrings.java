package com.StringProblems;
import java.util.HashMap;
import java.util.Map;

public class ToCheckTwoJumbledStrings {
	public static void main(String[] args) {
	String s1 = "shhaar";
	String s2 = "harsha";
	
	Map<Character,Integer> m1= new HashMap<Character,Integer>();
	Map<Character,Integer> m2= new HashMap<Character,Integer>();
	
	for(int i=0;i<s1.length();i++)
	{
		Integer c = m1.get(s1.charAt(i));
		if(c==null)
		{
			m1.put(s1.charAt(i), 1);
		}
		else
		{
			m1.put(s1.charAt(i), m1.get(s1.charAt(i))+1);
		}
	}
	
	for(int i=0;i<s2.length();i++)
	{
		Integer c = m2.get(s2.charAt(i));
		if(c==null)
		{
			m2.put(s2.charAt(i), 1);
		}
		else
		{
			m2.put(s2.charAt(i), m2.get(s2.charAt(i))+1);
		}
	}
	
	if(m1.equals(m2))
	{
		System.out.println("Both Strings are jumbled of each other");
	}
	else
	{
		System.out.println("not jumbled of each other");
	}

	}
	}
	

