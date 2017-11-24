import java.util.Scanner;
import java.util.Stack;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		String c;
		
		Stack stack = new Stack();
		
		System.out.println("Enter");
		String input = scanner.next();
		
		for(int i=0; i<input.length(); i++)
		{
			stack.push((input.charAt(i)));
			
			
			
		}
		
		
		
	}

}
