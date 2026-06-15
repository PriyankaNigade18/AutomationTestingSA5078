package com.CollectionFramework;

import java.util.TreeSet;

/*
 * TreeSet is class implement SortedSet which extends Set interface
 * Underline data structure is Search tree
 * TreeSet returns Sorted set
 * It It not order collection 
 * Duplication not allowed
 * 
 */
public class TreeSetDemo {

	public static void main(String[] args)
	{
	TreeSet<Integer> tr=new TreeSet<Integer>();
	tr.add(10);
	tr.add(1);
	tr.add(2);
	tr.add(4);
	tr.add(9);
	tr.add(6);
	tr.add(15);
	tr.add(3);
	tr.add(7);
	
	System.out.println(tr);
	
	System.out.println("Total Elements: "+tr.size());
	System.out.println(tr.contains(7));
	tr.remove(6);
	System.out.println(tr);
	System.out.println(tr.descendingSet());
	
	
	
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("Kirti");
	ts.add("Jay");
	ts.add("Abhay");
	ts.add("Kunal");
	
	System.out.println(ts);
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
