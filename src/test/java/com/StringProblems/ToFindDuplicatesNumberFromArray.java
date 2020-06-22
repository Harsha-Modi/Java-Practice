package com.StringProblems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ToFindDuplicatesNumberFromArray {

	public static void main(String[] args) {
		
		int[] a = {3,5,6,3,5,6,3,1};
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		
		Set<Integer> dup=new LinkedHashSet<Integer>();
		
		
		for ( int i=0;i<a.length;i++) 
		{ Integer count = m.get(a[i]); 
		if (count == null) 
		{ m.put(a[i], 1); } 
		else 
		{ m.put(a[i], ++count); 
		  }
			} 
		System.out.println(m);
		
		Set<Entry<Integer, Integer>> entrySet = m.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) 
		{ if (entry.getValue() > 1) 
		{ System.out.println("duplicate element key: "+ entry.getKey()+" and its value: " +entry.getValue());
		
		}
		 }

			
	}}
		
