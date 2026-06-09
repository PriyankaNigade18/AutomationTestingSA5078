package com.CoreJava.ControlFlowStatement;

/*
 * Loop
 * ==========
 * Number of Iteration/repetitive task
 * 
 * 1.for loop
 * --------------------
 * Number of Iterations are fix
 * Scenarios: Calendar/date pickers 30/31/28/29
 * 				Menu fix option
 * 
 * 
 * 2.while loop
 * ----------------
 * - Entry control loop
 * - Number of iterations are not fixed 
 * -Scenarios: pagination(webtable)/pageloadtime
 * 
 * 
 * 3.do while
 * --------------
 * -Exit control loop
 * -One time iteration without matter what condition it is(pass/fail)
 * 
 * Scenario: One time testing
 * 
 */



public class ForLoopDemo {

	public static void main(String[] args) 
	{

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		
		System.out.println("-------------");
		
		//print hello statement 5 times
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("-------------");

		//print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("-------------");
		//print 10 to 1
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("-------------");
		
		//sum of 100 natural numbers
		//1+2+3+4+....+100=5050
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
			
		}
		
		System.out.println("Sum of 100 natural numbers: "+sum);
		
		
		System.out.println("-------------");
		
		//factorial of 5!
		//5!=5*4*3*2*1=120
		
		int fact=1;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of 5 is: "+fact);
		
		System.out.println("-------------");
		
		//by default for loop condition is always true
		
//		for(;;)
//		{
//			System.out.println("Hi");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
