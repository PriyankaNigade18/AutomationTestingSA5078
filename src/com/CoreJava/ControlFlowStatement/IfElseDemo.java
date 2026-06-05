package com.CoreJava.ControlFlowStatement;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args)
	{

		System.out.println("Program starts......");
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();		
		
		if(age>=18)
		{
			System.out.println("Valid age for Voting");
		}
		else
		{
			System.out.println("Invalid age for Voting");
		}
		
		System.out.println("Program ends......");
		
		*/
		
		//API usecase
		int statusCode=300;
		
//		if(statusCode==200)
//		{
//			System.out.println("Successfull response!");
//		}else
//		{
//			System.out.println("Response fail!");
//		}
//		
		//200-299:successfull
		
		System.out.println("--------------------");
		
		
		if(statusCode>=200 && statusCode<=299)
		{
			System.out.println("Successfull response code");
		}else
		{
			System.out.println("Fail Response code");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
