package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * ArrayList is Class Implement List interface
 * Underline data structure is Dynamic Array
 * Frequent operation is data retrieval
 * ArrayList is order collection
 * ArrayList is allowed duplication
 * ArrayList is nonSynchronize class (At a time multiple process it can handle)
 * Default capacity of arrayList is 10 virtual segment
 */
public class ArrayListDemo2_Iteration {

	public static void main(String[] args) 
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(200);
		al.add(400);
		al.add(500);
		
		System.out.println(al);
		
		System.out.println("-----Simple for loop---------");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("-----forEach loop---------");
		
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		System.out.println("-----iterator()---------");
		/*
		 * iterator() is method returns Iterator interface Object
		 * It has two methods
		 * 1.hasNext():Returns true if the iteration has more elements
		 * 2.next():Returns the next element in the iteration.

		 */
		
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("-----listIterator()---------");
		/*
		 * listIterator()
		 * --------------------
		 * Using listiterator() we can iterate any List interface class 
		 * in both direction
		 */
		
		ListIterator<Integer> lr=al.listIterator();
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		System.out.println("-------------");
		
		while(lr.hasPrevious())
		{
			System.out.println(lr.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
