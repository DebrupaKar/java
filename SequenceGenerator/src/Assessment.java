import java.util.Scanner;

class AssessmentType 
{
	int weightage;
	int obtainedMarks;
	int totalmarks;
}

class Online extends AssessmentType
{
	public Online(int obtainedMarks, int totalMarks)
	{
		this.weightage = 50;
	}
}

class Coding extends AssessmentType
{
	public Coding(int obtainedMarks, int totalMarks)
	{
		this.weightage = 30;
	}
	
}

class ClassPerformance extends AssessmentType
{
	public ClassPerformance(int obtainedMarks, int totalMarks)
	{
		this.weightage = 20;
	}
	
}

public class Assessment
{
	public static void main(String args[])
	{
		int total;
		int marks;
		
		AssessmentType type;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your obtained and the total marks for coding:");
		marks = s.nextInt();
		total = s.nextInt();
		
		type = new Coding(marks,total);
		
		System.out.println("Enter your obtained and the total marks for online:");
		marks = s.nextInt();
		total = s.nextInt();
		
		type = new Coding(marks,total);
		
		System.out.println("Enter your obtained and the total marks for class performance:");
		int classScore = s.nextInt();
		int classTotal = s.nextInt();
		
		
		
		s.close();
		
		
		
		
		
	}
}




