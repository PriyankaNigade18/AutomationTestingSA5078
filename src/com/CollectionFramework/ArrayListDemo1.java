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
public class ArrayListDemo1 {

	public static void main(String[] args)
	{
	
		//create dynamic array with generic<Object type>
		//generic type list/set help to implement type safety
		//List<Integer> ls=new ArrayList<Integer>();
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
		
		System.out.println("-----Iteration----");
		
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		//clear the list:clear()
//		al.clear();
//		System.out.println(al);//[]
//		System.out.println(al.size());//0
		
		
		
		System.out.println("-----------------------");
		
		ArrayList<String> location=new ArrayList<String>();
		location.add("Mumbai");
		location.add("Pune");
		location.add("Satara");
		location.add("Delhi");
		
		System.out.println(location);
		
		//to retrieve any element we have get(index)
		
		System.out.println("Get the location at index 2: "+location.get(2));//Satara
		
		System.out.println("Total locations: "+location.size());//4
		
		System.out.println("Look for Pune?: "+location.contains("Pune"));//true
		
		System.out.println("-----Iteration----");
		
		for(String i:location)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		ArrayList<Double> score=new ArrayList<Double>();
		score.add(89.66);
		score.add(45.55);
		score.add(66.45);
		
		System.out.println(score);
		
		System.out.println("-----Iteration----");
		
		for(Double i:score)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println("-----------------------");
		
		ArrayList<Object> studentData=new ArrayList<Object>();
		
		studentData.add("Sarang");
		studentData.add("Pune");
		studentData.add('M');
		studentData.add(20);
		studentData.add(true);
		studentData.add(67.55);
		System.out.println(studentData);
		
		System.out.println("-----Iteration----");
		
		for(Object i:studentData)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//List<String> ls=new ArrayList<String>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
