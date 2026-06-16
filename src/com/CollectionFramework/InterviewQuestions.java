package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class InterviewQuestions {

	public static void main(String[] args) 
	{
		
		//How to sort array
		int arr[]= {100,20,30,50,10,40,22,11};
		
		for(int i:arr)
		{
			System.out.println(i);
		}

		System.out.println("-------------");
		
		//Arrays is class 
		Arrays.sort(arr);
		
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("----------------");

		List<Integer> ls=new ArrayList<Integer>();
		ls.add(100);
		ls.add(20);
		ls.add(77);
		ls.add(45);
		ls.add(10);
		ls.add(30);
		System.out.println(ls);
		
		List<Integer> lr=Arrays.asList(100,20,77,45,10,30);
		System.out.println(lr);
		
		//sort the list
		Collections.sort(lr);
		
		System.out.println(lr);
		
		System.out.println("Max number: "+Collections.max(lr));
		System.out.println("Min number: "+Collections.min(lr));
		
		System.out.println("---------------------");
		
		List<Integer> list1=Arrays.asList(1,2,3,1,2,3,4,5,6,3,6);
		
		System.out.println(list1);
		//remove duplicate elements: Convert list to set
		//1.constructor  2.addAll()
		
		//constructor
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>(list1);
		System.out.println(hs);
		
		//addAll()
		LinkedHashSet<Integer> hs2=new LinkedHashSet<Integer>();
		hs2.addAll(list1);
		System.out.println(hs2);
		
		System.out.println("---------");
		//remove duplicate characters from string
		String str1="aabbccabcdefg";
		String res="";
		System.out.println(str1);
		LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
		
		
		for(int i=0;i<str1.length();i++)
		{
			  char ch=str1.charAt(i);
			  lh.add(ch);
		}
		
		System.out.println(lh);
		
		for(Character i:lh)
		{
			res=res+i;
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
