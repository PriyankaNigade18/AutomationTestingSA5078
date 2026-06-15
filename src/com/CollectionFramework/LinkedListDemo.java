package com.CollectionFramework;

import java.util.LinkedList;

/*
 * LinkedList is class implement List interface
 * Underline data structure is DoublyLinkedList
 * Frequent operation is Insertion and deletion as LinkedList is based on node structure
 * LinkedList is order collection
 * Duplication allowed
 * 
 * Node structure
 * ----------------------------------------------------
 * Address of prev element|object|address of next element
 * ---------------------------------------------------------
 */
public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList<Integer> ls=new LinkedList<Integer>();
		
		if(ls.isEmpty())
		{
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(20);
			ls.add(40);
			ls.add(66);
		}
		
		System.out.println(ls);//[10, 20, 30, 20, 40, 66]
		System.out.println("Total elements: "+ls.size());//6
		
		//search
		System.out.println("look for 50?: "+ls.contains(50));//false
		
		//remove the object
		ls.remove(2);//30 will delete
		System.out.println(ls);//[10, 20, 20, 40, 66]
		
		
		//add element at any poistion
		ls.add(2,400);
		
		System.out.println(ls);//[10, 20, 400, 20, 40, 66]
		
		
		//linkedlist: addFirst(),addLast(),getFirst(),getLast()
		
		ls.addFirst(1000);
		ls.addLast(2000);
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		System.out.println(ls);
		
		System.out.println("----Iteration-------");
		
		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
