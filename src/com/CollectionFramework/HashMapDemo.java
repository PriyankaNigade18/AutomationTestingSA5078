package com.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap is class implement Map Interface
 * It store values based on Keys <key:value>
 * Underline data structure HashTable
 * 
 * HashMap have collection of Key and Value pair which is called Entry
 * Entry in technical word is interface
 * 
 * duplication in keys not allowed and values allowed
 * It is not order
 * 
 * 
 * 
 */
public class HashMapDemo {

	public static void main(String[] args) 
	{

		HashMap<String,Integer> map=new HashMap<String,Integer>();
		//To add element in map we use put()
		map.put("VimanNagar",411045);
		map.put("Lohegaon",411047);
		map.put("Wadgaosheri",411014);
		map.put("Kharadi",411047);
		
		System.out.println(map);
		
		System.out.println("Total locations: "+map.size());
		
		//search: containsKey(Key) containsValue(value)
		System.out.println("Look for key Lohegaon?: "+map.containsKey("Lohegaon"));
		System.out.println("Look for postal code 411045: "+map.containsValue(411045));
 		
		
		//get the data based on key
		System.out.println(map.get("Kharadi"));//value :411047
	
		
		//remove object
		map.remove("");
		
		System.out.println("Is map empty?: "+map.isEmpty());
		
		System.out.println(map);
		System.out.println("---------For Each loop--------");
		//Entry interface
		
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			System.out.println(i);
			
		}
		
		System.out.println("-----------");

		//Print only keys
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			System.out.println(i.getKey());
			
		}
		

		System.out.println("-----------");

		//Print only Values
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			System.out.println(i.getValue());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
