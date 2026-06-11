package com.OOP.Encapsulation;
/*
 * What is Encapsulation?
Binding of data and function together in a single unit is called encapsulation
  
 What is Purpose?
 Data hiding or security
  
 Real time example?
 Capsule, class, object
  
 How to implement in Java?
 Declare data as private and provide access using 
 getters and setters method
 
 setters(): set the data
 getters(): get the data
 * 
 * 
 * 
 * 
 * 
 * 
 */


 class Employee
{
	private int id=101;
	private String name="Kiran";
	private int salary=80000;
	//public methods to modify and access data
	public int getSalary() {
		return this.salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	 public void show()
	 {
		 System.out.println("Employee id: "+id);
		 System.out.println("Employee name :"+name);
		 System.out.println("Employee salary: "+salary);
	 }



	
	 
	 
}

public class EncapsulationDemo {

	public static void main(String[] args) 
	{

		//object of employee
		Employee e1=new Employee();
		e1.show();
		
		//update salary
		//e1.salary=900000;//The field Employee.salary is not visible
		e1.setSalary(90000);
		System.out.println(e1.getSalary());
		
		e1.show();
		
		
		
		
		
		
		
		
		
		
		

	}

}
