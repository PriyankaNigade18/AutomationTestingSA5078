package com.Methods_Constructor;

public class ReturnKeyword 
{
	public int add(int a,int b)//2 parameter are local
	{
		return a+b;
	}

	public String info(String msg)
	{
		return msg;
	}
	
	
	public int getStatus(int statusCode)
	{
		
		System.out.println("Status code is: "+statusCode);
		return statusCode;
	}
	
	public static void main(String[] args)
	{
		//call
		ReturnKeyword  r1=new ReturnKeyword ();
		
		//return data store and use it
		int result=r1.add(100,70);
		System.out.println("Addition is: "+result);
		
		String res=r1.info("Hi...");
		System.out.println(res);

		//OR
		
		
		System.out.println("Message: "+r1.info("Hello...."));

		int code=r1.getStatus(400);
		
		if(code==200)
		{
			System.out.println("success....");
		}
		
		else
		{
			System.out.println("Error.....");
		}
	}

}
