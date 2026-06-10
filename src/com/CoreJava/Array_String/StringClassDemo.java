package com.CoreJava.Array_String;

/*
 * String is collection of characters
 * String is an immutable class in Java 
 * String declare in two ways
 * --------------------------
 * 1.String with literal(recommended by java)
 * 2.String with new keyword
 * 
 * So any string declare in literal way internally it will create object 
 * inside SCP(String constant pool)
 * SCP is memory where string literals create and scp never allow duplication
 * 
 * Any object created with new keyword then object will create inside JVM heap
 * Jvm Heap allowed duplication
 * 
 * 
 * 
 */
public class StringClassDemo {

	public static void main(String[] args) 
	{

		 String s1="Hello";
		 String s2="Hello";
		 /*
		  * == compares id provided by Jvm
		  * Methods compare value of string
		  */
		 
		 
		 System.out.println(s1==s2);//true
		 System.out.println(s1.equals(s2));//true
		 
		 s1=s1+"All";
		 
		 System.out.println(s1==s2);//false
		 System.out.println(s1.equals(s2));//false
		 
		 
		 System.out.println("---------Methods---------------------");
		 
		 //length()
		 
		 String ss1="Hello All";
		 
		 System.out.println("Total Length is: "+ss1.length());//9
		 
		 //to convert string toUpperCase() toLowerCase()
		 
		 System.out.println(ss1.toUpperCase());
		 System.out.println(ss1.toLowerCase());
		 
		 //String equality 1.equals() 2.equalsIgnoreCase()
		 
		 String ss2="Selenium WebDriver is WebUI automation Library";
		 
		 String ss3="Selenium WebDriver is WebUI automation Library";
		 
		 String ss4="Selenium WebDriver is WEBUI automation Library";
		 System.out.println(ss2.equals(ss3));//true
		 System.out.println(ss2.equalsIgnoreCase(ss3));//true
		 
		 System.out.println(ss2.equals(ss4));//false
		 System.out.println(ss2.equalsIgnoreCase(ss4));//true
		 
		 
		 //contains(): partial match
		 String ss5="Selenium WebDriver is WEBUI automation Library";
		 System.out.println("Search for WEBUI?: "+ss5.contains("WEBUI"));//true
		 System.out.println("Search for TestNg?: "+ss5.contains("TestNG"));//false
		 
		 System.out.println("-------------------------");
		 //startsWith(prefix value)  endsWith(Suffix value)
		 
		 
		 System.out.println("String starts with Selenium?: "+ss5.startsWith("Selenium"));//true
		 		 System.out.println("String starts with Sel?: "+ss5.startsWith("Sel"));//true
		 System.out.println("String starts with s?: "+ss5.startsWith("s"));//false
		 System.out.println("String starts with S?: "+ss5.startsWith("S"));//true
		 System.out.println("String starts with WebDriver?: "+ss5.startsWith("WebDriver"));//false
		 
		 
		 System.out.println("String ends with Selenium?: "+ss5.endsWith("Selenium"));//false
		 
		 System.out.println("String ends with Library?: "+ss5.endsWith("Library"));//true
		 System.out.println("String ends with ry?: "+ss5.endsWith("ry")); //true
		 System.out.println("String ends with Lib?: "+ss5.endsWith("Lib"));//false
		 
		 
		 System.out.println("--------------");
		 //trim(): ignore white space before and after the string
		 
		 String ss6="       Welcome all          ";
		 System.out.println(ss6);
		 System.out.println(ss6.trim());
		 
		 //To get single character from string : charAt(index)
		 
		 String ss7="Playwright is end to end testing framework";
		 
		 System.out.println("character at index 7: "+ss7.charAt(7));//g
		 
		 System.out.println("Character at 10 index: "+ss7.charAt(10));//white space
		 System.out.println("character at index 15: "+ss7.charAt(15));//n
		 
		 System.out.println("character at index 0: "+ss7.charAt(0));//P
		 
		 System.out.println("-----------");
		 
		 //Returns the index within this string of the first occurrence ofthe specified character
		 //to get index number for character : indexOf(Char):index
		 /*
		  		 System.out.println("Index for character first i: "+ss7.indexOf('i'));//6
		 System.out.println("Index for character second i: "+ss7.indexOf('i',7));//11
		 
		 System.out.println("Index for character Third i: "+ss7.indexOf('i',12));//29

		 */
		 
		 int first=ss7.indexOf('i');
		 System.out.println(first);//6
		 int second=ss7.indexOf('i',first+1);
		 System.out.println(second);//11
		 int third=ss7.indexOf('i',second+1);
		 System.out.println(third);//29
		 
		 System.out.println("--------------------");
		 //concat()
		 String ss8="Hi";
		 String ss9="All";
		 System.out.println(ss8+" "+ss9);
		 System.out.println(ss8.concat(" "+ss9));
		 
		 
		 //substring():Returns a string that is a substring of this string.
		 
		 String ss10="Playwright is end to end testing framework";
		 System.out.println(ss10.indexOf('e'));//14
		 
		 System.out.println(ss10.substring(14));//end to end testing framework
		 System.out.println(ss10.substring(14,20));//end to
		 
		 
		 //replace()
		 String ss11="Playwright is end to end testing framework";
		 
		 System.out.println(ss11.replace("testing","api"));
		 	 
		 //isEmpty():length() should be 0
		 String s4="";
		 System.out.println("Current string is empty?: "+s4.isEmpty());//true
		 
		 //toCharArray():Converts this string to a new character array.
		 String s5="Hello";
		 char arr[]=s5.toCharArray();
		 for(char i: arr)
		 {
			 System.out.println(i);
		 }
		 
		 System.out.println(s5.toCharArray()[3]);//l
		 
		 
		 
		 //split():Splits this string around matches of the given regular expression. 
		 
		 String tools="Selenium,Appium,Postman,Cypress,Playwright";
		 System.out.println(tools);
		 
		 String tool[]=tools.split(",");
		 
		 for(String i:tool)
		 {
			 System.out.println(i);
		 }
		 
		 System.out.println("----------");
		 System.out.println(tools.split(",")[3]);
		 
		 String date="June 2026";
		 System.out.println(date.split(" ")[0]);
		 System.out.println(date.split(" ")[1]);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
