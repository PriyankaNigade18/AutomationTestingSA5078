package com.CoreJava.ControlFlowStatement;

public class Branchingstatements
{

	public static void main(String[] args) 
	{
		// break: Exit from switch-case or loop
		
		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				break;//exit from loop
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("------------");
		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;//exit from loop
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("------------");
		
		//continue: it will skip the certain part of code and continue execution till last iteration
		
		for(int i=1;i<=10;i++)
		{
			if(i==8)
			{
				continue;//skip certain part of code & continue
			}
			else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
