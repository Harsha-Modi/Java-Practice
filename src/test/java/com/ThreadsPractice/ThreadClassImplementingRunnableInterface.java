package com.ThreadsPractice;

class Task1 implements Runnable
{
	@Override
	public void run() {//--> need to provide body of unimplemented method
		//task1
		System.out.println("Task 1 started");
		for(int i=11;i<=20;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("Taks1 completed");
	}}

public class ThreadClassImplementingRunnableInterface {
	
	public static void main(String[] args) {

		Task1 obj = new Task1();
		Thread threadObj = new Thread(obj);//--> if 'Runnable' interface is implemented then we must have to create obj of 'Thread' class then provide obj of task class as an argument to thread obj.
		threadObj.start();
		
		//task2
		System.out.println("Task 2 started");
		for(int i=21;i<=30;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("Taks2 completed");
	}

}
