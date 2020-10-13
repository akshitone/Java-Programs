package assign2;

import java.util.Scanner;

class Employee
{
	private
		int id, salary;
	private
		String name, dept;
	
	int i = id, s = salary;
	String n = name, d = dept;
	
	Employee()
	{
		id =  salary = 0;
		name = dept = null;
	}
	
	Employee(int i, int s, String n, String d)
	{
		id = i;
		salary = s;
		name = n;
		dept = d;
	}
	
	void accept()
	{
		System.out.println("Enter Employee details: ");
	}
	
	void display()
	{
		System.out.println("Employees details are: " + id + " " + salary + " " + name + " " + dept);
	}
}

class Manager extends Employee
{
	private
		int bonus;
	
		static int max;
		int totalSalary;
	
	Manager()
	{
		bonus = 0;
	}
	
	Manager(int i, int s, String n, String d, int b)
	{
		super(i, s, n, d);
		bonus = b;
	}
	
	void accept()
	{
		System.out.println("Enter Manager details: ");
	}
	
	void display()
	{
		System.out.println("Employees details are: " + i + " " + s + " " + n + " " + d + " " + bonus);
	}
}

public class assignQ6
{
	public static void main(String[] args)
	{
		int i, s, b;
		String n, d;
		
		Scanner sc = new Scanner(System.in);
		
		Manager m[] = new Manager[2];
		
		System.out.println("Enter the deatils of manager-");
		for(int j=0; j<2; j++)
		{
			System.out.println("Enter the id: ");
			i = sc.nextInt();
			System.out.println("Enter the name: ");
			n = sc.next();
			System.out.println("Enter the dept: ");
			d = sc.next();
			System.out.println("Enter the salary: ");
			s = sc.nextInt();
			System.out.println("Enter the bonus: ");
			b = sc.nextInt();
			
			m[j] = new Manager(i, s, n, d, b);
		}
		
		System.out.println("Manager with maximum salary: ");
		int o;
		for(int j=0; j<2; j++)
		{
			
		}
	}
}
