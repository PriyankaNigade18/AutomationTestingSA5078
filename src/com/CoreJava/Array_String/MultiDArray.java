package com.CoreJava.Array_String;

public class MultiDArray {

	public static void main(String[] args) 
	{
		// Using new keyword
		
		/*int rnumber[][]=new int[2][3];
		
		rnumber[0][0]=101;
		rnumber[0][1]=102;
		rnumber[0][2]=103;
		
		
		rnumber[1][0]=104;
		rnumber[1][1]=105;
		rnumber[1][2]=106;*/
		
		//literal way of representation
		int rnumber[][]= {{101,102,103},{104,105,106,107},{108,109}};
		
		System.out.println("Total number of rows: "+rnumber.length);//2
		//row-->columns-->data
		System.out.println("Total number of columns: "+rnumber[1].length);//3
		
		//single entry
		System.out.println(rnumber[1][1]);//105
		
		//System.out.println(rnumber[1][3]);//ArrayIndexOfBoundsException
		
		
		
		System.out.println("-------Nested For loop--------");

		//rows
		for(int i=0;i<rnumber.length;i++)
		{
			//column
			for(int j=0;j<rnumber[i].length;j++)
			{
				System.out.print(rnumber[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
