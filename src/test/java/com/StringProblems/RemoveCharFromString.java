package com.StringProblems;

public class RemoveCharFromString {

	public static void main(String[] args) {
		
		String s = "Harsha";
		Character ToRemove = 'a';
		char[] c = s.toCharArray();
		String newstr="";
		
		for(int i=0;i<c.length;i++)
		{
			if(!(ToRemove.equals(c[i])))
			{
			newstr=newstr+c[i];	
			}
		}
		
		System.out.println(newstr);

	}

}
