package com.OOP.Encapsulation;

public class LoginPageTest {

	public static void main(String[] args)
	{

		//login page object
		LoginPage user1=new LoginPage();
		user1.setUserName("Pooja");
		user1.setPassword("pooja123");
		user1.doLogin(user1.getUserName(),user1.getPassword());
		
		System.out.println("-----------------");
		
		LoginPage user2=new LoginPage();
		user2.setUserName("Raj");
		user2.setPassword("raj123");
		user2.doLogin(user2.getUserName(),user2.getPassword());
	}

}
