package com.CoreJava.ControlFlowStatement;

import java.util.Scanner;

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
public class WhileLoopDemo {

	public static void main(String[] args) 
	{

//print hello statement 5 times
		
		int i=1;
		while(i<=5)
		{
			System.out.println("Hello");
			i++;
		}
		
		
		System.out.println("-------------");
		
		//sum of digits logic
		//123=1+2+3=6   102=3
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;
		int rem,sum=0;
		
		while(num>0)//digits are not fixed
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		
		
		System.out.println("sum of digits of number "+temp+" is : "+sum);
		*/
		System.out.println("-------------");
		
		//reverse number logic
		
		int num=123,rem,sum=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum*10+rem;
		}
		
		
		System.out.println("Reverse number is: "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
