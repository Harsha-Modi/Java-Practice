package com.StringProblems;

public class ToPrintFirstNprimeNo {

	
	public static void main(String[] args) {
		
		int count=0;
		int num=1;
		boolean indicator=true;
		ToPrintFirstNprimeNo obj = new ToPrintFirstNprimeNo();
		
		while(count<10)
		{
			num++;
			indicator=obj.calculatePrimeNo(num);
				if(indicator==true)
					count++;
				
		}
											}
	
public boolean calculatePrimeNo(int x)
{
	int num = x;
	boolean flag = true;
	for(int i=2;i<num/2;i++)
	{
		
		if(num%i==0)
		{
			flag=false;	
			break;
		}
	}
		if(flag==true)
		{
			System.out.println(num+" ");
			
		}
					
		
	
	return flag;
	}

}


