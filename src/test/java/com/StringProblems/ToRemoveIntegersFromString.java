package com.StringProblems;

public class ToRemoveIntegersFromString {

	public static void main(String[] args) {
		
		String s = "avg56hjh7ugfjg7gf3bkbk";
		s=RemoveInteger(s);
		System.out.println(s);
		
	}
		
	public static String RemoveInteger(String s)
		{
		StringBuffer sb=new StringBuffer(s);
		//StringBuffer str=new StringBuffer();
		
		for (int i=0;i<=sb.length()-1;i++)
		{
			if(sb.charAt(i)>47&&sb.charAt(i)<57)
			{
				sb.deleteCharAt(i);
				//str=str.append(sb.charAt(i));
				i--;
			}
		}
		return sb.toString();	
		}	
}
		
