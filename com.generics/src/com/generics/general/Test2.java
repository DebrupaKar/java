package com.generics.general;


abstract class Subject 
{
	String type;
	
}

class Java extends Subject 
{
	public Java()
	{

		this.type = "Java";
	}
	
}

class JavaScript extends Subject 
{
	public JavaScript()
	{

		this.type = "JavaScript";
	}
	
}

class Trainer<T extends Subject> {

	T subject;

	public String getSubject() {
		return subject.type;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}
}

public class Test2 
{
	public static void main(String[] args) 
	{

		Trainer<Java> javaTrainer = new Trainer<>();
		
		javaTrainer.setSubject(new Java());
		System.out.println(javaTrainer.getSubject());
		
		
		Trainer<JavaScript> javaScriptTrainer = new Trainer<>();
		
		javaScriptTrainer.setSubject(new JavaScript());
		System.out.println(javaScriptTrainer.getSubject());
		
		
		
		
	

	}

}
