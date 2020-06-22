package com.StringProblems;
import java.util.HashMap;
import java.util.Map;

public class ToPrintCharactersWithNoOfOccurance {

	public static void main(String[] args) {
		
	String s = "Harsha modi";
	
	Map<Character, Integer> m = new HashMap<Character,Integer>();
		
		for(int i =0; i<s.length();i++)
		{
			if(m.containsKey(s.charAt(i)))
					{
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
					}
			else
			{
				m.put(s.charAt(i), 1);
			}
		}
		
System.out.println(m);
		
}}
