package com.Methods_Constructor;

import java.util.Scanner;

public class UserInputCode {

	public static void main(String[] args) 
	{
		/*
		 * In Java System.out it is called Output stream
		 *  and  System.in it is called input stream which will accept data  from console
		 *  
		 *  
		 *  Scanner is predefined class in java
		 *  It has method to read user data
		 *  int ---->nextInt()
		 *  long---->nextLong()
		 *  string---->nextLine()
		 *  double--->nextDouble()
		 */
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();

		System.out.println("Hello "+name+" your age is: "+age);


	}

}
