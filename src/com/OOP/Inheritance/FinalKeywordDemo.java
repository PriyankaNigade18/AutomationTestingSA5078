package com.OOP.Inheritance;


//immutable class like String
//final class Demo : Error
class Demo
{
	
	 final int amount=5000;//immutable variable
	
	 //immutable method
	public final void getDetails()
	{
		System.out.println("Amount is: "+amount);
	}
	
	
}

//The type FinalKeywordDemo cannot subclass the final class Demo
public class FinalKeywordDemo extends Demo
{
//Cannot override the final method from Demo
//	@Override
//	public void getDetails()
//	{
//		System.out.println("Amount is: "+(amount*amount));
//	}
//	
	public static void main(String[] args)
	{

		FinalKeywordDemo f1=new FinalKeywordDemo();
				
				f1.getDetails();
				//f1.amount=10000;//The final field Demo.amount cannot be assigned
				f1.getDetails();
	}

}
