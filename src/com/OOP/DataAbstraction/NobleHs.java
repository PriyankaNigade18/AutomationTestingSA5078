package com.OOP.DataAbstraction;


//Multiple Inheritance
public class NobleHs implements IMA,USMA
{
	public void medicalService()
	{
		System.out.println("NobleHs.......Medical()");
	}

	@Override
	public void cardioService() {

		System.out.println("NobleHs......Cardio()");
		
	}

	@Override
	public void dentalService()
	{
		System.out.println("NobleHs......Dental()");

		
	}

	@Override
	public void neroService() {
		System.out.println("NobleHs......NeroService()");
		
	}

	@Override
	public void physioService() {
		System.out.println("NobleHs......Physio()");

		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHs.....Covid19Test()");
		
	}

}
