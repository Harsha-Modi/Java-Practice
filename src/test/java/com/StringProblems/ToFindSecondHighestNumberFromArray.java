package com.StringProblems;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ToFindSecondHighestNumberFromArray {

	public static void main(String[] args) {
		
		int a[] = {4,9,0,32,21,3,11};
		Find(a);
		System.out.println("second highest integer from array: "+a[a.length-2]);

	}
public static int[] Find(int a[])
{
	Arrays.sort(a);
	
	return a;
	}
}
