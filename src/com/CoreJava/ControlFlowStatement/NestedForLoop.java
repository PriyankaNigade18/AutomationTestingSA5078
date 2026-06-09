package com.CoreJava.ControlFlowStatement;

public class NestedForLoop {

	public static void main(String[] args)
	{
		// print table of 2

		int num=5;
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		
		System.out.println("-----------");
		
		//print 1 to 10 all table
		
		
		
		for(int no=1;no<=10;no++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(no*i+"\t");
			}
			System.out.println();//next line
		}
		
		System.out.println("-----------");
		
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+"  ");
			}
			System.out.println();//next line
		}
		
		
		System.out.println("-----------");
		
		
		for(int r=1;r<=4;r++)
		
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
