package com.ExceptionHandling;

import java.util.Scanner;

public class RunTimeExceptionHandling 
{
	int id=1010;
	

	public static void main(String[] args)
	{
		System.out.println("Program starts....");

		RunTimeExceptionHandling  r1=new RunTimeExceptionHandling ();
		r1=null;
		try {
		System.out.println(r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Check the details as you are getting: "+n.getMessage());
		}
		
		System.out.println("Program ends....");
		
		
		
		
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 0 to 4");
		int index=sc.nextInt();
		
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
		}catch(Exception e)
		{
			System.out.println("Please provide appropriate index number");
		}
		
		*/
		System.out.println("---------------");
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		try {
		System.out.println("Division is: "+(a/b));//ArithmeticException
		}catch(ArithmeticException i)
		{
		System.out.println("Provide any other number than 0");	
		}
		System.out.println("Multiplication is: "+(a*b));
		
		

	}

}
