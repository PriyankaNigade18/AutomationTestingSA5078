package com.OOP.DataAbstraction;

public class TestHospital {

	public static void main(String[] args) 
	{

		//Parent ref and Parent class Object
		//IMA i1=new IMA();//Cannot instantiate the type IMA
		
		//child class ref and child class object
		NobleHs n1=new NobleHs();
		n1.medicalService();//individual
		n1.cardioService();//inherited abstract 
		n1.dentalService();//inherited abstract 
		n1.neroService();//inherited abstract 
		n1.physioService();//inherited abstract 
		n1.covid19Test();
		
		System.out.println("-----------------");
		//Parent ref and child class object:Parent 
		IMA i1=new NobleHs();
		i1.cardioService();//individual
		i1.dentalService();//individual
		i1.covid19Test();
		
		System.out.println("----------");
		
		USMA u1=new NobleHs();
		u1.neroService();
		u1.physioService();
		u1.covid19Test();
		
		
		
		
		
	}

}
