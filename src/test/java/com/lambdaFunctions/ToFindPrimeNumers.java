package com.lambdaFunctions;
import java.util.List;

public class ToFindPrimeNumers {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6);
		
		//list.stream().map(e->e%2==1).forEach(p->System.out.println(p));
		list.stream().filter(e->e%2==1).forEach(p->System.out.println(p));

	}

}
