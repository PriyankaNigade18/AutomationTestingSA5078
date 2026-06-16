package com.ExceptionHandling;

public class ThrowsExample 
{
	
	public void m1() throws InterruptedException
	{
		System.out.println("m1 is calling....");
		m2();
		
	}
	
	public void m2() throws InterruptedException
	{
		System.out.println("m2 is calling....");
		m3();
	}

	
	public void m3() throws InterruptedException
	{
		System.out.println("m3 is calling....");
		Thread.sleep(2000);
		System.out.println("Done!");
	}


	public static void main(String[] args) throws InterruptedException
	{
		ThrowsExample  t1=new ThrowsExample ();
		t1.m1();
		
	}

}
