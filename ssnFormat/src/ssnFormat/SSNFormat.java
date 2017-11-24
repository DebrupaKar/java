package ssnFormat;

import java.util.Scanner;

public class SSNFormat {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter");
		
		String sen = s.next();
		boolean b=true;
		
		int len=sen.length();
		if(len==11)
		{
			for(int i=0 ; i<sen.length() ; i++)
			{
				if(sen.charAt(3) == '-')
				{
					for(int j=3 ; j<sen.length() ; j++)
					{
						if(sen.charAt(6) == '-')
						{
							continue;
						}
						else
						{
							b=false;
							break;
						}
							
					}	
				}
				else
				{
					b=false;
					break;
				}
			}
		}
		else
			b=false;
		
		if(b==true)
			System.out.println("Valid");
		else
			System.out.println("Not valid");
	}
}
