package com.ThreadsPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Job extends Thread{
	
	private int taskNumber;
	public Job(int taskNumber)
	{
		this.taskNumber= taskNumber;
		System.out.println("\n Task"+taskNumber);
		for(int i=taskNumber*10;i<=taskNumber*10+10;i++)
			{System.out.print(i+" ");}
	}
	}


public class ExecuteWithFixedThreadPool {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);//--> only 3 threads will execute at a time
		executorService.execute(new Job(1));
		executorService.execute(new Job(2));
		executorService.execute(new Job(3));
		executorService.execute(new Job(4));
		executorService.execute(new Job(5));
		executorService.execute(new Job(6));
		executorService.execute(new Job(7));
		executorService.shutdown();
	}

}
