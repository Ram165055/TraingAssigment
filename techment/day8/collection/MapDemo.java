package com.techment.day8.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class MapDemo {

	public static void main(String[] args) {
		HashMap  hm=new HashMap();
		hm.put(1, 1);
		hm.put(2, 2);
		hm.put(3,3);
		hm.put(2,5);
		hm.put(8,3);
		System.out.println("HashMap"+hm);
		
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(1, 1);
		lm.put(3,3);
		lm.put(2,2);
		lm.put(2, 5);
		System.out.println("LinkedHashMap"+lm);
		TreeMap tm=new TreeMap();
		tm.put(1, 4);
		tm.put(2,3);
		tm.put(3, 3);
		tm.put(3, 5);
		System.out.println("TreeMap"+tm);
		
		HashMap<String,String> mp=new HashMap<String, String>();
		mp.put("Sachin","Sachin is a batsman");
		mp.put("dravid","he is a wicket keeper");
		mp.put("dhoni", "dhoni is a captain");
		mp.put("rahane","he is a wichet keeper");
		System.out.println(mp);
		System.out.println("printing key value pare");
		for(Entry<String, String> e :mp.entrySet()) {
			System.out.println(e);
		}
		System.out.println("printing the values");
for(String val:mp.values()) {
	System.out.println(val);
}
System.out.println("printing the key");
for(String val:mp.keySet()) {
	System.out.println(val);
}
	}

}
