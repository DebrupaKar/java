import java.util.Random;
import java.util.Scanner;


abstract class Sequence
{
	int first;
	int last;
	public abstract void  sequenceGenerator(int first, int last);
}

class RandomSequenceGenerator extends Sequence
{
	public void sequenceGenerator(int first, int last)
	{
		Random randomGenerator = new Random();
	    for (int i=first ; i<=last ; i++){
	      int randomInt = randomGenerator.nextInt(100);
	      System.out.println(randomInt + " ");
	    }
		
	}
}

class SquareSequenceGenerator extends Sequence 
{
	public void sequenceGenerator(int first, int last)
	{
		for(int i=first ; i<=last ; i++)
		{
			System.out.println(i*i + " ");
		}
		
	}
}

class PrimeSequenceGenerator extends Sequence 
{
	boolean checkPrime(int no)
	{
		int i;
		int cnt =0;
		if(no == 2)
		{
			return true;
		}
		for(i=1;i<=no;i++)
		{
			if(no%i == 0)
				cnt++;
		}
		
		if(cnt ==2)
			return true;
		return false;
	}
	
	public void sequenceGenerator(int first, int last)
	{
		int i;
		boolean flag;
		for(i=first; i<=last; i++)
		{
			flag = checkPrime(i);
			if(flag == true)
				System.out.println(i+" ");
		}
	}
}

public class seqn {

	public static void main(String[] args) {
		int first;
		int last;
		
		Sequence seq;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		first = s.nextInt();
		
		System.out.println("Enter the last number");
		last = s.nextInt();
		
		System.out.println("Enter your option:");
		System.out.println("1.Prime 2.Random 3.Square");
		int option = s.nextInt();
		
		switch(option)
		{
		case 1: seq = new PrimeSequenceGenerator();
				seq.sequenceGenerator(first,last);
				break;
				
		case 2: seq = new RandomSequenceGenerator();
				seq.sequenceGenerator(first,last);
				break;
				
		case 3:	seq = new SquareSequenceGenerator();
				seq.sequenceGenerator(first,last);
				break;
		}
		
		s.close();
	
	}
}

