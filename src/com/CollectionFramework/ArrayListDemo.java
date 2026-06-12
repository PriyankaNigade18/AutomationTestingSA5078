package com.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList is Class Implement List interface
 * Underline data structure is Dynamic Array
 * Frequent operation is data retrieval
 * ArrayList is order collection
 * ArrayList is allowed duplication
 * ArrayList is nonSynchronize class (At a time multiple process it can handle)
 * Default capacity of arrayList is 10 virtual segment
 */
public class ArrayListDemo {

	public static void main(String[] args)
	{
	
		//create dynamic array with generic<Object type>
		//generic type list/set help to implement type safety
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList<Integer> al=new ArrayList<Integer>();//Integer object
		System.out.println("Is list is empty?: "+al.isEmpty());//true
		
		//insert elements in list: add()
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(50);
		
		System.out.println("After inserting elements ,IsList empty?: "+al.isEmpty());//false
		
		System.out.println("Total objects/elements in list?: "+al.size());//6
		
		System.out.println(al);//[10, 20, 30, 20, 40, 50]
		
		//insert element at position 3
		al.add(3,null);
		
		System.out.println(al);//[10, 20, 30, null, 20, 40, 50]
		
		//search element from list: contains()
		
		System.out.println("Search for 50?: "+al.contains(50));//true
		System.out.println("Search for 100?: "+al.contains(100));//false
		
		//remove the object from list:remove(index)
		al.remove(3);//remove null object
		System.out.println(al);
		
		//clear the list:clear()
		al.clear();
		System.out.println(al);//[]
		System.out.println(al.size());//0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//List<String> ls=new ArrayList<String>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
