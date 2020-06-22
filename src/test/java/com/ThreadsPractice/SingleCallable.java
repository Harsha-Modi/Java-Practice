package com.ThreadsPractice;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>
 {  
	private int taskNum;
	public CallableTask(int taskNum)
	{
		this.taskNum = taskNum;
	}
	@Override
	public String call() throws Exception {//--> this method we have to implement from callable interface
		return "Task"+taskNum+" completed";
	}	 
 }

public class SingleCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<String> results = executorService.submit(new CallableTask(1));//--> need to store results or return calls from thread
		String message = results.get();//--> to get message
		System.out.println(message);
		System.out.println("Main completed");
		executorService.shutdown();
	}

}
