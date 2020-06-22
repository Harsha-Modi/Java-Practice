package com.lambdaFunctions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortAMap {

	static Map<String, Double> nameAgeMap = new HashMap<>();

	public static void main(String[] args) {
		nameAgeMap.put("harsha", 55.20);
		nameAgeMap.put("priyanka", 55.01);
		nameAgeMap.put("sourabh", 44.26);
		nameAgeMap.put("dheeraj", 55.95);

		Map<String, Double> sortedMap = new LinkedHashMap<>();
		sortedMap = nameAgeMap.entrySet().stream()
				.sorted(Map.Entry.<String, Double>comparingByValue().reversed())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(),(e1,e2) -> e2,LinkedHashMap::new));

		// print
		sortedMap.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " , " + e.getValue());
		});
	}
}