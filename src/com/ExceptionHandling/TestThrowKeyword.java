package com.ExceptionHandling;

public class TestThrowKeyword {

	public static void main(String[] args) throws StringIsNullException
	{

		String s1=null;
		if(s1==null)
		{
			throw new StringIsNullException("null string!");
		}

	}

}
