package com.lambdaFunctions;
import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,5,8,0,4);
		
		
		System.out.println(list.stream().reduce(0, (n1,n2)->(n1+n2))); 
		
	}
}
