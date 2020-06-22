package com.lambdaFunctions;
import java.util.List;

public class SquareOfNumbers {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,5,7,6,0,8);
		
		list.stream().map(element -> element*element).forEach(p-> System.out.println(p));

	}

}
