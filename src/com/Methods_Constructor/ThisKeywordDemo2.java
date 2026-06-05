package com.Methods_Constructor;


//this can be used to invoke current class method (implicitly)

public class ThisKeywordDemo2
{
	int id=10;
	
	public void m1()
	{
		System.out.println("M1 is calling.....");
		this.m2();
		//this.m3();
		m3();
		
	}
	
	public void m2()
	{
		System.out.println("M2 is calling.....");
		this.m3();
	}
	public void m3()
	{
		System.out.println("M3 is calling.....");
	}
	
	
	public static void main(String[] args)
	{
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.m1();
		
		
		
		
		
		
		
//		t1.m2();
//		t1.m3();
		


	}

}
