package com.StringProblems;

public class StarProgramInBothOrder {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
    		for(int j=1;j<=5-i;j++)
    		{
        		System.out.print(" ");
    		}
    			for(int k=1;k<=i;k++)
    			{
    			System.out.print("* ");
    			}
    		System.out.println("");
		}	
		
		for(int l=5;l>=1;l--)
		{
			for(int h=1;h<=5-l;h++)
			{
				System.out.print(" ");
			}
			for(int r=1;r<=l;r++)
			{
			System.out.print("* ");
			}
			System.out.println("");
			
		}
}		
	}


