package com.lambdaFunctions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToSortNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(7);
		list.add(5);
		list.add(1);
		list.add(3);
		
		Collections.sort(list, (n1,n2) -> n1.compareTo(n2));
		System.out.println(list);
	}

}
