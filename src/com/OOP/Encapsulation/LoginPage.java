package com.OOP.Encapsulation;

public class LoginPage 
{
	
	//Encapsulation=private data + public method
	private String userName;
	private String password;
	
	//methods	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	//Business Logic
	public void doLogin(String un,String psw)
	{
		System.out.println("Hello "+un+" Welcome to your profile....");
	}

}
