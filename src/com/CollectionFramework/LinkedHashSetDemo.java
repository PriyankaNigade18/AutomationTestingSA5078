package com.CollectionFramework;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet is class It has both List interface and Set interface features
 * Underline data structure is DoublyLinked list
 * LinkedHashSet is Order collection (no indexing)
 * LinkedHashSet is stored unique elements/duplication not allowed
 */
public class LinkedHashSetDemo {

	public static void main(String[] args)
	{

		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(20);
		ls.add(40);
		ls.add(30);
		ls.add(50);
		
		System.out.println(ls);
		
		System.out.println("Is set is empty?: "+ls.isEmpty());
		System.out.println("Total elements are: "+ls.size());

	}

}
