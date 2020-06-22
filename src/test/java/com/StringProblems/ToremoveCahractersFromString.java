package com.StringProblems;

public class ToremoveCahractersFromString {

	public static void main(String[] args) {
		String s = "avg56hjh7ugfjg7gf3bkbk";
		s=RemoveCharacters(s);
		System.out.println(s);
	}
	
	public static String RemoveCharacters(String s)
	{
	StringBuffer sb=new StringBuffer(s);
	
	
	for (int i=0;i<=sb.length()-1;i++)
	{
		if(sb.charAt(i)<48||sb.charAt(i)>57)
		{
			sb.deleteCharAt(i);
			
			i--;
		}
	}
	return sb.toString();	
	}

}
