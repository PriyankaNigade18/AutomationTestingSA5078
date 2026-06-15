package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet is class implement Set interface
 * Underline data structure is HashTable
 * 
 * HashTable maintains data in table based on Hash function(Hashing mechanism)
 * in this as per object hashcode and key calculated then based on key and code 
 * index generates and based on index object store inside table
 * 
 * Frequent operation search element
 * HashSet internally created 16 virtual segment[0 to 15]
 * HashSet is not order collection(no index)
 * duplication not allowed
 * 
 * 
 */



public class HashSetDemo {

	public static void main(String[] args) 
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(null);
		
		
		System.out.println(hs);
		
		System.out.println("Total Elements: "+hs.size());
		System.out.println("Is set empty: "+hs.isEmpty());
		
		//search
		System.out.println("Look for 44?: "+hs.contains(44));//false
		
		//remove(object)
		hs.remove(null);
		System.out.println(hs);
		
		//clear 
//		hs.clear();
//		System.out.println(hs);
//		System.out.println(hs.size());
		
		
		System.out.println("-------ForEach loop----");
	
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		
		System.out.println("------------");

		Iterator<Integer> ir=hs.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
