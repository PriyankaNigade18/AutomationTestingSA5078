package com.OOP.DataAbstraction;

public class ChildLoginPage extends Page
{
	
	public void launchApp()
	{
		System.out.println("ChildLoginPage......launchApp()");
	}

	

	@Override
	public void findElement() {

		System.out.println("ChildLoginPage.....findElement() implemented through child");
		
	}
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Scenario1: Parent ref and Parent Object: Invalid in DA");
		//Page p1=new Page();
		
		
		System.out.println("Scenario2: Child class ref and child class object: Parent +child");
		
		ChildLoginPage lp=new ChildLoginPage();
		lp.getTitle();//inherited
		lp.findElement();//inherited abstract method
		lp.launchApp();//individual
		
		System.out.println("Scenario3: Parent ref and Child class object: Parent");
		
		Page p1=new ChildLoginPage();
		p1.getTitle();
		p1.findElement();
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	

}
