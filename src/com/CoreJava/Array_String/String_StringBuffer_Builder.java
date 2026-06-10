package com.CoreJava.Array_String;

public class String_StringBuffer_Builder {

	public static void main(String[] args)
	{
		/*
		 * String
		 * ---------------
		 * -Immutable class
		 * -non synchronize(at a time multiple process)
		 * 
		 * StringBuffer class
		 * ----------------
		 * -Mutable class
		 * -older
		 * -Synchronize(at a time one process)
		 * 
		 * StringBuilder class
		 * ---------------------
		 * -Mutable class
		 * -Non Synchronized
		 * 
		 * 
		 * 
		 */

		
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb);//Hello
		sb.append("All");
		
		System.out.println(sb);//HelloAll
		
		System.out.println(sb.reverse());
		
		
		System.out.println("-------------");
		String s1="Java selenium";
		String res="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			res=res+s1.charAt(i);
		}

		
		System.out.println(res);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
