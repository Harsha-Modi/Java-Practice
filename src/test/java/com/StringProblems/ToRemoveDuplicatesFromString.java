package com.StringProblems;
import java.util.HashSet;
import java.util.Set;

public class ToRemoveDuplicatesFromString {

	public static void main(String[] args) {
		String s = "harsha";
		//ToRemoveDuplicatesFromString obj=new ToRemoveDuplicatesFromString();
		//RemoveDuplicates(s);
        //System.out.println("string after removing duplicates :" +s);
		System.out.println(RemoveDuplicates(s));
	}
public static String RemoveDuplicates(String s)
{
	Set<Character> set = new HashSet<>();
	//char[] a =new char[10];
	StringBuffer sb = new StringBuffer();
	
	for(int i=0;i<=s.length()-1;i++)
	{
		Character c = s.charAt(i);
		if(!set.contains(c))
		{
			set.add(c);
			sb.append(c);
		}
	}
	
	String FinalString =sb.toString();
	return FinalString;
	}
}
