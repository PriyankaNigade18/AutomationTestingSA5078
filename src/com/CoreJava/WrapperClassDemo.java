package com.CoreJava;

/*
 * Wrapper class 
 * -------------------
 * - This is class help to convert any primitive data to Object
 * - It has Object for each primitive data
 * 
 * primitive           Wrapper Class
 * byte  				Byte
 * short				Short
 * int					Integer
 * long					Long
 * char					Character
 * boolean				Boolean
 * float				Float
 * double 				Double
 * 
 */
public class WrapperClassDemo {

	public static void main(String[] args)
	{

		//primitive to Object
		
		//int convert into Object(integer)
		int x=100;//int data
		Integer obj=Integer.valueOf(x);//Integer object

		
		boolean status=true;//boolean data
		Boolean bobj=Boolean.valueOf(status);//Boolean Object
		
		
		//Object to Primitive
		
		Integer i1=678789;//object
		int a=i1.intValue();
		double d1=i1.doubleValue();
		
		//String Object----->Primitive (In Automation)
		//NumberFormatException - if the string does not contain aparsable integer.
		String s1="100";//string object
		System.out.println(s1+100);//100100
		//string to int
		int ss1=Integer.parseInt(s1);
		System.out.println(ss1+100);//200
		
		System.out.println("=============");
		String s2="200.56";
		System.out.println(s2+11.10);//200.5611.10
		//string to double
		double d2=Double.parseDouble(s2);
		System.out.println(d1+11.10);
		
		
		System.out.println("===============================");
		
		/*
		 * Scenario:
		 * Validate bill amount is less than 10000
		 */
		
		String bill="Your amount is 5000";
		String data=bill.split(" ")[3];
		System.out.println(data);
		//string to int
		int amount=Integer.parseInt(data);
		
		//validate
		if(amount<10000)
		{
			System.out.println("Amount match....Test pass!");
		}else
		{
			System.out.println("Amount not match....Test Fail!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
