package assign2;

import java.util.Scanner;

class Person
{
	int personId;
	String name;
}

class Student extends Person
{
	private
		String courseName;
	private 
		int feePaid;
	
	Student(String c, int f)
	{
		courseName = c;
		feePaid = f;
	}
	
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of student: ");
		name = sc.nextLine();
		
		System.out.println("Enter the id of student: ");
		personId = sc.nextInt();
		
		
	}
	
	void display()
	{
		System.out.println("Id of student is: " + personId);
		System.out.println("Name of student is: " + name);
		System.out.println("Course Name of student is: " + courseName);
		System.out.println("Fees Paid by student is: " + feePaid);
	}
}

class Faculty extends Person
{
	private
		String subjectName;
	private
		int expYears;
	
	Faculty(String s, int e)
	{
		subjectName = s;
		expYears = e;
	}
	
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of faculty: ");
		name = sc.nextLine();
		
		System.out.println("Enter the id of faculty: ");
		personId = sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Id of faculty is: " + personId);
		System.out.println("Name of faculty is: " + name);
		System.out.println("Subject Name of faculty is: " + subjectName);
		System.out.println("Expeience Years of faculty is: " + expYears);
	}
}
public class AssignQ1
{
	public static void main(String[] args)
	{
		Student s = new Student("MCA", 150000);
		Faculty f = new Faculty("JAVA", 10);
		
		s.accept();
		f.accept();
		
		s.display();
		f.display();
	}
}
