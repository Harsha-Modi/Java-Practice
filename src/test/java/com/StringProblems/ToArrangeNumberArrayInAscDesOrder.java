package com.StringProblems;

public class ToArrangeNumberArrayInAscDesOrder {

	public static void main(String[] args) {
		
		int[] a = {5,3,8,1,4,9,7};
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int k=0;k<a.length;k++)
		{
		System.out.print(a[k]+" ");	
		}
	}
}
