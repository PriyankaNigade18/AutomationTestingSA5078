package com.OOP.Inheritance;

public class NewAccessModifier 
{
	int id=101;//default
	public String name="Sarang";
	private long phno=90968989898L;
	protected int acnum=678654;
	

	public static void main(String[] args) {
		//same class
		
		NewAccessModifier  a1=new NewAccessModifier ();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acnum);

	}

}
