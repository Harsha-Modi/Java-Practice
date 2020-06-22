package com.StringProblems;
import java.util.Arrays;

public class ToPrintLargestAndMinimumNoFromArray {

	public static void main(String[] args) {
		
		int[] a = new int[]{4,52,12,78,23,10};
		int[] b = abc1(a);
		
		System.out.println(b[b.length-1]+","+b[0]);
		
		}
	public static int[] abc1(int[] a)
	{
	Arrays.sort(a);
	return a;
	}

	private static int[] abc(int[] a) {
		// TODO Auto-generated method stub
		return null;
	}
}
