package com.StringProblems;
import java.util.Arrays;
import java.util.Collections;

public class ToArrangeStringArrayInAscendingAndDescendingOrder {

	public static void main(String[] args) {
		
		String[] a={"cat","fish","god","apple","grapes","boll","$","#"," ","5"};
		
		String[] Asc= InAscendingOrder(a);
		System.out.println("in ascending order:");
		for (String s1 : Asc) {
			System.out.println(s1);
		}
		//System.out.println(Asc);
		String[] Des=InDescendingOrder(a);
		//System.out.println(Des);
		System.out.println();
		System.out.println("in descending order:");
		for (String s2 : Des) {
			System.out.println(s2);
		}
	}
	public static String[] InAscendingOrder(String[] a)
		{
		Arrays.sort(a);	
		return a;
		}	
public static String[] InDescendingOrder(String[] a)
{Arrays.sort(a,Collections.reverseOrder());
	return a;	
}
}


