package com.CoreJava.Array_String;


/*
 * Array is static data structure in Java
 * Array can store similar type of data and Object
 * Array have fixed size and type of data
 * Array store data as per index
 * 
 * Types
 * -----------
 * 1.Single Dimensional (1D)
 * 2.Multi Dimensional(2D)
 * 
 * Ways to declare
 * ---------------
 * 1.Using new Keyword(as array implemented in java as object)
 * 2.Using literal
 * 
 * 
 */
public class Array1DDemo {

	public static void main(String[] args) 
	{
		
		//using new keyword
		int sid[]=new int[5];
		sid[0]=10;
		sid[1]=20;
		sid[2]=30;
		sid[3]=40;
		sid[4]=50;
		
		//length property
		System.out.println("Total number are: "+sid.length);
		
		//single value from array
		System.out.println(sid[2]);//30
		
		System.out.println(sid[0]);//10
		
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException:
		
		System.out.println("-----For loop---------");
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("-----ForEach loop---------");
		
		for(int i: sid)
		{
			System.out.println(i);
		}
				
		System.out.println("--------------");
		
		//Using literal
		
		int id[]= {101,102,103,104,105};
		//index     0    1   2   3   4
		
		System.out.println("Total numbers in array: "+id.length);
		
		System.out.println(id[2]);//103
		
		System.out.println(id[4]);//105
		
		//System.out.println(id[-1]);//ArrayIndexOutOfBoundsException:
		
		System.out.println("-----For loop---------");
		
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("-----ForEach loop---------");
		
		for(int i: id)
		{
			System.out.println(i);
		}
		
		
		System.out.println("--------------");
		
		String city[]= {"Pune","Mumbai","Delhi","Nashik"};
		System.out.println("Total Cities are: "+city.length);
		
		System.out.println(city[3]);//Nashik
		
		
		System.out.println("-----For loop---------");
		
		for(int i=0;i<city.length;i++)
		{
			System.out.println(city[i]);
		}
		
		System.out.println("-----ForEach loop---------");
		
		
		for(String i:city)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println("--------------");
		double marks[]= {45.33,89.66,67.33,55.45,70.44};
		
		System.out.println("Total marks added: "+marks.length);//5
		
		System.out.println(marks[2]);//67.33
		
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("-----ForEach loop---------");
		
		for(double i: marks)
		{
			System.out.println(i);
		}
		
		
		System.out.println("---------Real data-----------------");
		
		Object empData[]= {"Sarang","Pune",25,'M',78.88,6879809989L};
		
		System.out.println("Total entries: "+empData.length);//
		System.out.println(empData[2]);//
		
		
		System.out.println("-----For Each loop-----");
		
		for(Object i:empData)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
