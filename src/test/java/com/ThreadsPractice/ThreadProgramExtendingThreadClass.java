package com.ThreadsPractice;

 class Taks1 extends Thread // --> either extend 'Thread' class or implement 'Runnable' interface
{
	public void run() //--> method always should be of this same name
	{
		//task1
		System.out.println("Task 1 started");
		for(int i=11;i<=20;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("Taks1 completed");
	}		
}

public class ThreadProgramExtendingThreadClass {

	public static void main(String[] args) {
		
		Taks1 obj = new Taks1();
		obj.start();
		
		//task2
				System.out.println("Task 2 started");
				for(int i=21;i<=30;i++)
				{
					System.out.print(i+" ");
				}
				System.out.println("Taks2 completed");
			}	
}
