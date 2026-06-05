package com.CoreJava.ControlFlowStatement;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args)
	{

		//traffic signals
		
		String color="red";
		
		switch (color) 
		{
		case "red":
			System.out.println("STOP");
			break;//exit from switch body
			
		case "yellow":
			System.out.println("READY");
			break;
			
		case "green":
			System.out.println("GO");
			break;
			
		default:
			System.out.println("Wrong Color....");
			
		}
		
		
		System.out.println("-----------------------");

			
		//for number it should return spelling
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number between 0 to 4");
		int num=sc.nextInt();
		
		switch (num) {
		case 0:
			System.out.println("Zero");
			break;

		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;

		case 4:
			System.out.println("Four");
			break;

		default:
			System.out.println("Wrong choice!");
		}
		
		System.out.println("----------------------");
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc2.nextLine();
		
		//String bname="edge";
		switch (bname.toLowerCase()) {
		case  "chrome":
			System.out.println("Test case is executing on chrome");
			break;
		case "edge":
			System.out.println("Test case is executing on edge");
			break;
		case "firefox":
			System.out.println("Test case is executing on firefox");
			break;

		default:
			System.out.println("Wrong Browser!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
