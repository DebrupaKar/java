package com.generics.general;

public class Test 
{
	public static void main(String[] args) 
	{
		Box<String> box = new Box<>();

		Util.addNumbers(new Box<>());
		Util.addStrings(new Box<>());
	}
}
