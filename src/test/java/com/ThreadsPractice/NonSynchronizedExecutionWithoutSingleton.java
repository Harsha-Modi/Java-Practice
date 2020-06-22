package com.ThreadsPractice;

public class NonSynchronizedExecutionWithoutSingleton {

	class Task extends Thread
	{
		public void Run()
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
	
	public static void main(String[] args) throws InterruptedException {
		
		Taks1 obj = new Taks1();
		obj.start();
		obj.join();//--> with this task would start once task1 gets completed, without this they will run in concurrent
		//task2
				System.out.println("Task 2 started");
				for(int i=21;i<=30;i++)
				{
					System.out.print(i+" ");
				}
				System.out.println("Taks2 completed");
			}	
	}


