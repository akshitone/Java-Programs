package assign2;

import java.util.Scanner;

abstract class Staff
{
	String name,add;
	Staff(String n, String a)
	{
		name = n;
		add = a;
	}
}

class FullStaff extends Staff
{
	String dept;
	int salary;
	FullStaff(String n, String a, String d, int s)
	{
		super(n, a);
		dept = d;
		salary = s;
	}
	
	void display()
	{
		System.out.println("Details of full-time staff: " + name + " " + add + " " + dept + " " + salary);
	}
}

class PartStaff extends Staff
{
	int nohours;
	int ratehours;
	PartStaff(String n, String a, int noh, int rph)
	{
		super(n, a);
		nohours = noh;
		ratehours = rph;
	}
	
	void display()
	{
		System.out.println("Details of part-time staff: " + name + " " + add + " " + nohours + " " + ratehours);
	}
}

public class AssignQ8
{
	public static void main(String[] args)
	{	
		String n, a, d, str;
		int s, noh, rph;
		
		FullStaff f[] = new FullStaff[2];
		PartStaff p[] = new PartStaff[2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which details of staff to display?");
		str = sc.next();
		
		if(str.equalsIgnoreCase("full"))
		{			
			System.out.println("Enter the details: ");
			for(int i=0; i<2; i++)
			{
				System.out.println("Enter name: ");
				n = sc.next();
				System.out.println("Enter address: ");
				a = sc.next();
				System.out.println("Enter dept: ");
				d = sc.next();
				System.out.println("Enter salary: ");
				s = sc.nextInt();
				
				f[i] = new FullStaff(n, a, d, s);
			}
		}
		else if(str.equalsIgnoreCase("part"))
		{				
			System.out.println("Enter the details: ");
			for(int i=0; i<2; i++)
			{
				System.out.println("Enter name: ");
				n = sc.next();
				System.out.println("Enter address: ");
				a = sc.next();
				System.out.println("Enter no of hrs: ");
				noh = sc.nextInt();
				System.out.println("Enter rate per hr: ");
				rph = sc.nextInt();
				
				p[i] = new PartStaff(n, a, noh, rph);
			}
		}
		else
			System.out.println("Invalid Input...");
		
		System.out.println("Which details to display?");
		str = sc.next();
		if(str.equalsIgnoreCase("full"))
		{
			for(int i=0; i<2; i++)
				f[i].display();
		}
		else if(str.equalsIgnoreCase("part"))
		{
			for(int i=0; i<2; i++)
				p[i].display();
		}
		else
			System.out.println("Invalid Input...");
	}
}