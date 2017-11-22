package com.generics.general;

public class Util 
{
	public static void addNumbers(Box<Number> box) 
	{
		box.setT(1);
		System.out.println(box.toString());
	}

	public static void addStrings(Box<Object> box) 
	{
		box.setT("hello");
		System.out.println(box.toString());
	}
}
