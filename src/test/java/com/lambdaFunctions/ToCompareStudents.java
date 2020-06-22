package com.lambdaFunctions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToCompareStudents {
	int rollNo;
	String name;

	 public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	ToCompareStudents(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static void main(String[] args) {
		List<ToCompareStudents> studentList = new ArrayList<>();
		studentList.add(new ToCompareStudents(10,"harsha"));
		studentList.add(new ToCompareStudents(20,"siddhesh"));
		studentList.add(new ToCompareStudents(30,"vaibhav"));
		studentList.add(new ToCompareStudents(40,"mayur"));
		
		//sort according to name
		System.out.println("sort according to name");
		Collections.sort(studentList, ( s1, s2) -> s1.getName().compareTo(s2.getName()));
		studentList.forEach(s -> System.out.println(s.getRollNo()+" "+s.getName()));
		
		//sort according to rollNo
		System.out.println("sort according to rollNo");
		Collections.sort(studentList, ( s1, s2) -> Integer.valueOf(s1.getRollNo()).compareTo(Integer.valueOf(s2.getRollNo())));
		studentList.forEach(s -> System.out.println(s.getRollNo()+" "+s.getName()));
	}
 
	
}
