package assign1;

import java.util.Scanner;

import sy.*;
import ty.*;

class StudMarks
{
	int rollNo; 
	SYMarks sym = new SYMarks(); 
	TYMarks tym = new TYMarks();
	String name;
	
	StudMarks()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the RollNo. of student: ");
		rollNo = sc.nextInt();
		
		System.out.println("Enter the Name of student: ");
		name = sc.next();
	}
	
	void addMarks()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the CS marks in theory: ");
		tym.theoryMarks = sc.nextInt();
		
		System.out.println("Enter the CS marks in practical: ");
		tym.practicalMarks = sc.nextInt();
	}
	
	int total()
	{
		sym.computerTotal = (tym.theoryMarks + tym.practicalMarks);
		return sym.computerTotal;
	}
	
	void calGrade()
	{
		int o = total();
		
		if(o >= 70)
			System.out.println(" Grade is A.");
		if(o >= 60 && o < 70)
			System.out.println(" Grade is B.");
		if(o >=50 && o < 60)
			System.out.println(" Grade is C.");
		if(o >= 40 && o < 50)
			System.out.println(" Pass Class.");
		if(o < 40)
			System.out.println(" Fail.");
	}
	
	void display()
	{
		System.out.print("Roll No. of student is: " + rollNo + ";");
		System.out.print("Name of student is: " + name + ";");
	}
}

public class AssignQ13
{
	public static void main(String[] args)
	{
		StudMarks s = new StudMarks();
		s.addMarks();
		s.display();
		s.calGrade();
	}
}
