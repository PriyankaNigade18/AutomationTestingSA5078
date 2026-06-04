package com.Methods_Constructor;

import java.util.Scanner;

public class RunTimeParameterPassing {

		public void add(int a,int b)
		{
			System.out.println("Addition for user Input: "+(a+b));
		}
	
		//with return keyword
		public boolean getStatus(boolean status)
		{
			return status;
		}
		
		
		
		
	public static void main(String[] args)
	{

		/*
		 * When we pass arguments at the time of execution to the method 
		 * then it is called run time parameter passing
		 */
		
		RunTimeParameterPassing r1=new RunTimeParameterPassing();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1=sc.nextInt();	
		
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter status");
		boolean res=sc.nextBoolean();
		
		r1.add(num1,num2);//run time now
		
		System.out.println("Status is: "+r1.getStatus(res));
		
		
		
		
		
		
		
		

	}

}
