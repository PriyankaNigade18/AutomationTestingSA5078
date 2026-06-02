package com.CoreJava;

/*
 * Type casting
 * -----------------
 * Conversion of one type of data into another type 
 * data must be compatible & covertable
 * 
 * 1.Primitive to primitive
 * 		1.1 Implicit casting
 * 		1.2 Explicit casting
 * 
 * Wrapper class
 * ------------------------
 * 2.Primitive to Object
 * 3.Object to primitive
 * 
 */
public class TypeCasting {

	public static void main(String[] args)
	{
		//Primitive to Primitive conversion
		
		/*
		 * Implicit: 
		 * ---------------
		 * Automatic conversion by JVM
		 * Small size---->Large size
		 * byte-->short-->int-->long--->float--->double
		 * 
		 */

		int x=100;//4byte
		long l=x;//8byte
		System.out.println("int to long conversion: "+l);
		
		char ch='A';//2byte
		int y=ch;//4byte
		System.out.println("character to int conversion: "+y);//65
		
		
		long l2=687890;//8byte
		float f1=l2;//4byte
		System.out.println("Long to float conversion: "+f1);
		
		
		/*
		 * Explicit
		 * ---------------
		 * Forcefull or manual conversion 
		 * To complete explicit casting we use casting operator (datatype)
		 * 
		 * large size---->small size
		 * double--->float-->long-->int-->short--byte
		 *  
		 * 
		 */
		
		long l3=687689798798989090L;//8byte
		System.out.println(l3);
		int i=(int)l3;//Type mismatch: cannot convert from long to int
		System.out.println("long to int conversion: "+i);
		
		int i2=120;
		char ch2=(char) i2;
		System.out.println("int to character conversion: "+ch2);
		
		double d1=9809.67878;
		int t=(int) d1;
		System.out.println("double to int conversion: "+t);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
