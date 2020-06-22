package com.StringProblems;
 
public class OrderOfExecution_Static_Instance_Constructor {
	
	OrderOfExecution_Static_Instance_Constructor()
		{this(10);
		System.out.println("no args constructor");}
	
	OrderOfExecution_Static_Instance_Constructor(int x)
		{System.out.println("args constructor");}
	
	static{System.out.println("1st static block");}
	static{System.out.println("2nd static block");}
	
	{System.out.println("1st instance block");}
	{System.out.println("2nd instance block");}

	public static void main(String[] args)
	{
		OrderOfExecution_Static_Instance_Constructor obj1 = new OrderOfExecution_Static_Instance_Constructor();	
		OrderOfExecution_Static_Instance_Constructor obj2 = new OrderOfExecution_Static_Instance_Constructor(5);
	}

}

