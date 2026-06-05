package com.CoreJava.ControlFlowStatement;

import java.util.Scanner;

public class SimpleIf {

	//Simple if is testing one true condition....
	public static void main(String[] args) 
	{
		
		//validate current year
		
		System.out.println("Program starts.........");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		
		if(year==2026)
		{
			System.out.println("Current year match....");
		}
		
		System.out.println("Program ends.........");

	}

}
