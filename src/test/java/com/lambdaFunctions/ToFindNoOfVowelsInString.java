package com.lambdaFunctions;
import java.util.Arrays;
import java.util.List;

public class ToFindNoOfVowelsInString {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		String string = new String("Harsha");
		List<char[]> list = Arrays.asList(string.toCharArray());
		
		list.stream().filter(e -> e.equals('a')||e.equals('e')||e.equals('i')||e.equals('o')||e.equals('u') ).forEach(e -> System.out.println(e));

	}

}
