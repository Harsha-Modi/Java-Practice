package com.ThreadsPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	private int taskNumber;

	public Task(int taskNumber)
	{ this.taskNumber =taskNumber;
	
	System.out.println("\n Task"+taskNumber);
	for(int i = taskNumber*10;i<=taskNumber*10+10;i++) {
		System.out.print(i+" ");
	}
}}


public class SingleThreadExecution {

	public static void main(String[] args) {
		 ExecutorService executorService = Executors.newSingleThreadExecutor();//--> now every task will not run concurrent, they would be execute one after another
		 executorService.execute(new Task(1));
		 executorService.execute(new Task(2));
		

	}
}
	

