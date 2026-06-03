package com.CoreJava;

public class OperatorsInJava {

	public static void main(String[] args)
	{
		
		System.out.println("----Arithmetic Operators--------");
		
		int a=10,b=5;
		//System.out.println("Addition is:"+a+b);//Addition is:105		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
		
		
		/*Unary operators
		 * ------------------
		 * 
		 * Increment(++)  & Decrement(--)
		 * 
		 * Increment
		 * -------------------
		 * PreIncrement ++a: It will perform operation on that number immediatly
		 * 
		 * PostIncrement a++: It will first as it is give the value and then at the time
		 * of reuse you will get variable increment value
		 * 
		 * a++=   a=a+1
		 * 
		 * Decrement(--)
		 * ---------------------
		 * PreDecrement(--a)
		 * PostDecrement(a--)
		 * 
		 * a--= a=a-1
		 * 
		 */
		
		System.out.println("----Increment------");
		int x=100;
		System.out.println(x);//100
		System.out.println(++x);//101
		
		int y=200;
		System.out.println(y);//200
		System.out.println(y++);//200
		System.out.println(y);//201
		
		
		System.out.println("----Decrement------");
		
		int p=90;
		System.out.println(p);//90
		System.out.println(--p);//89
		
		int q=88;
		System.out.println(q);//88
		System.out.println(q--);//88
		System.out.println(q);//87
		System.out.println(q);//87
		System.out.println(q--);//87
		System.out.println(q);//86
		
		System.out.println("-----Interview question-----");
		
		int i=90;
		int j=i++;//here value will assign first and then increment as it is post increment
		System.out.println(i);//91
		System.out.println(j);//90
		
		int e=578;
		int f=e++;
		System.out.println(e);//579
		System.out.println(f);//578
		
		
		int k=45;
		int l=++k;//here value will increment first and then assign as it is pre increment
		System.out.println(k);//46
		System.out.println(l);//46
		
		int c=150;
		int d=++c;
		System.out.println(c);//151
		System.out.println(d);//151
		
		int r=190;
		int s=r--;
		System.out.println(r);//189
		System.out.println(s);//190
		
		int u=64;
		int v=--u;
		System.out.println(u);//63
		System.out.println(v);//63
		
		System.out.println("--------Interview based-------");
		
		//System.out.println(9/0);//ArithmeticException
		System.out.println(5/0.0);//Infinity
		System.out.println(10/5.5);//1.8181818181818181
		System.out.println(0.0/2);//0.0
		System.out.println(0/10);//0
		//System.out.println(0/0);//ArithmeticException
		
		System.out.println("--------Relational Operators-------");
		/* <, <= , > ,>=, == ,!=(not equal to)
		 * 
		 * Test Data
		 * ------------
		 * k=l=46  u=v=63 r=189 s=190 c=151 d=151 i=91 j=90
		 * 
		 */
		
		System.out.println("less than <: "+(k<j));//true
		System.out.println("less than or equal to: <= "+(u<=v));//true
		System.out.println(d<l);//false
		System.out.println("greater than >: "+(c>i));//true
		System.out.println("greater than or eqaul to: >="+(s>=c));//true
		System.out.println(k>j);//false
		
		//Comparison ==
		System.out.println("Comparison operator ==:  "+(u==v));//true
		System.out.println(i==j);//false
		
		System.out.println("not equal to !=: "+(i!=k));//true
		System.out.println(k!=l);//false
		
		System.out.println("--------Logical Operators-------");
		/*
		 * c1    c2			&&(AND)			||(OR)     !(NOT)
		 * ------------------------------------------------------
		 * true  true		true			true		false
		 * true	 false		false			true		false
		 * false true		false			true		true
		 * false false		false			false		true
		 * 
		 * Test Data
		 * ------------
		 * k=l=46  u=v=63 r=189 s=190 c=151 d=151 i=91 j=90
		 * 
		 */
		
		System.out.println("----&&----");
		System.out.println(i>j && u==v);//true
		System.out.println(k==l && r>s);//false
		System.out.println(v>=i && u==v);//false
		System.out.println(k>l && c>d);//false
		
		
		System.out.println("----||----");
		System.out.println(i>j || u==v);//true
		System.out.println(k==l || r>s);//true
		System.out.println(v>=i || u==v);//true
		System.out.println(k>l || c>d);//false
		
		
		System.out.println("---!(Not)-----");
		
		System.out.println(u==v);//true
		System.out.println(!(u==v));//false
		
		
		//On String we cant not perform primitive operator 
		//On String we apply methods
		
		//City should not be equal to Mumbai
		
		String city="Pune";
		System.out.println(!city.equals("Mumbai"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("--------------------");
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
