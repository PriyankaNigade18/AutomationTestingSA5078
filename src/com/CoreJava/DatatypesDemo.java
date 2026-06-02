package com.CoreJava;

public class DatatypesDemo {

	public static void main(String[] args)
	{

		//boolean true/false 1bit
		
		boolean status=true;
		System.out.println("Boolean data is: "+status);//true
		 status=false;
		System.out.println("Same boolean data updated to: "+status);//false
		
		boolean newStatus=true;
		System.out.println("New status is: "+newStatus);//true
		
		System.out.println("--------------");
		/*
		 * Numeric--->Character
		 * Any single character into char data type
		 * 2byte memory
		 * 
		 * Char type can store
		 * -------------------
		 * 1.single alphabets
		 * 2.single special characters 
		 * 3.Unicode/Ascii value of characters
		 * 
		 * A-Z= 65 to 90
		 * a-z= 97 to 122
		 * 0 to 9= 48 to 57
		 * 
		 */
		
		char ch1='A';
		char ch2='$';
		char ch3=90;//here 90 will store as ascii value of character
		System.out.println("Character value: "+ch1);//A
		System.out.println("Character value: "+ch2);//$
		System.out.println("Character value for 90: "+ch3);//Z
		char ch4=99;
		System.out.println(ch4);//c
		
		System.out.println("---------------");
		/*
		 * Integral--->Integer
		 * 1.byte 2.short 3.int 4.long
		 * 
		 * By default any number in Java is int type
		 *  
		 */
		
		//byte 1byte -128 to 127
		
		byte b1=120;
		byte b2=127;
		byte b3=-128;
		byte b4=-126;
		//byte b5=150;//Type mismatch: cannot convert from int to byte
		
		System.out.println("Byte data is: "+b1);
		System.out.println("Byte data is: "+b2);
		System.out.println("Byte data is: "+b3);
		System.out.println("Byte data is: "+b4);
		
		
		//short 2byte -32768 to 32767 
		
		short s1=32000;
		short s2=32767;
		short s3=-32768;
		
		//short s4=50000;//Type mismatch: cannot convert from int to short
		System.out.println("Short data is: "+s1);
		System.out.println("Short data is: "+s2);
		System.out.println("Short data is: "+s3);
		
		//int 4byte 
		
		int i1=50000;
		//int i2=8679889809;//The literal 8679889809 of type int is out of range 
		
		System.out.println("integer data is: "+i1);
		
		//long 8byte
		long l1=8679889809L;
		
		long l2=100;
		
		System.out.println("long data is: "+l1);
		System.out.println("long data is: "+l2);
		
		System.out.println("----------------------");
		
		/*
		 * Integral --->Floating point
		 * 
		 * 1.float  4byte 
		 * 2.double 8byte 
		 * 
		 * by default any decimal digit number is double type
		 * 
		 */
		
		
		double d1=89.6878979;//8byte
		
		System.out.println("double number is: "+d1);
		float f1=67.44F;
		System.out.println("Float number is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
