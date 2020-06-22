package com.StringProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderSubstring
{
	public static void main(String[] args) {
	
		String s = "I love my india";
		String[] subs = s.split(" ");
		List<Integer> list = new ArrayList<Integer>();
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for(int i =0;i<subs.length;i++)
		{
			m.put(subs[i], subs[i].length());
			list.add(subs[i].length());
		}
	
		Collections.sort(list);
		
	int maxLength = list.get(list.size()-1);
	int minLength = list.get(0);
	
	Set<Entry<String,Integer>> entry = m.entrySet();
	
	for(Entry<String, Integer> e : entry)
	{
		if(e.getValue().equals(maxLength))
		{
			System.out.println("Maximum length substring is "+e.getKey()+" and its length is "+e.getValue());
		}
		
		if(e.getValue().equals(minLength))
		{
			System.out.println("Minimum length substring is "+e.getKey()+" and its length is "+e.getValue());
		}
	}
	
	
	}

}
