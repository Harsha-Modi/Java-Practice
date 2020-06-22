package com.StringProblems;

public class InterviewQuestion {

	public static void main(String[] args) {
		
	String s = "I love my INDIA";
	int i=s.lastIndexOf(" ");
	String s1 = s.substring(i+1);
	String s2="";
	char[] c=s1.toCharArray();
	for(int j=s1.length()-1;j>=0;j--)
	{
		s2=s2+s1.charAt(j);
	}
	System.out.println("reversed string is: "+s2);
	
	String s3= s.replace(s1, s2);
	System.out.println("new String is: "+s3);
	}

}
