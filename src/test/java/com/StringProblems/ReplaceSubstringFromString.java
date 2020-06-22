package com.StringProblems;

public class ReplaceSubstringFromString {

	public static void main(String[] args) {
		
		String s1= "I love my India";
		String toRemove = "love";
		String toReplace = "like";
		String s3="";
		String[] s2=s1.split(" ");
		
		
		for(int j=0;j<s2.length;j++)
		{
			if(s2[j].equals(toRemove))
			{
				s2[j]=toReplace;
				s3=s3+s2[j]+" ";
			}
			else
			{
				s3=s3+s2[j]+" ";
			}
		}
		
		System.out.println("original string is : "+s1);
		System.out.println("new string is : "+s3.trim());

	}

}
