package assign2;

import java.util.Scanner;

class emp
{
	Scanner sc = new Scanner(System.in);
	private
	int id, salary;
	private
	String name, dept;
	emp()
	{
		
	}
	emp(int i,int s,String n,String d)
	{
		id=i;
		salary=s;
		name=n;
		dept=d;
	}
	public void accept()
	{
		System.out.println("Enter The Manager ID:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter The Name:");
		name=sc.nextLine();
		System.out.println("Enter The Department:");
		dept=sc.nextLine();
		System.out.println("Enter Salary:");
		salary = sc.nextInt();
	}
	public void disp()
	{
		System.out.println("Manager ID:" + id);
		System.out.println("Manager Name:" + name);
		System.out.println("Department:" + dept);
		System.out.println("Manager Salary:" + salary);
	}
	public int sal()
	{
		return salary;
	}
}
class manager1 extends emp
{
	Scanner sc = new Scanner(System.in);
	private int bonus;
	public int total;
	manager1()
	{
		
	}
	manager1(int i, int s, String n, String d, int b)
	{
		super(i, s, n, d);
		bonus = b;
	}
	public void accept()
	{
		super.accept();
		System.out.println("Enter The Bonus:");
		bonus = sc.nextInt();
		bon();
	}
	public void disp()
	{
		super.disp();
		System.out.println("Bonus Amount:" + bonus);
	}
	public void bon()
	{
		int x=sal();
		total = x+bonus;
	}
}
public class rajan
{

	public static void main(String[] args)
	{
		int n,max;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Managers:");
		n=sc.nextInt();
		manager1 obj[] = new manager1[n]; 

		for(int i=0;i<n;i++)
		{
			obj[i]=new manager1();
			obj[i].accept();
		}
		max = 0;
		for(int i=1;i<n;i++)
		{
			if(obj[i].total > obj[max].total)
			{
				max=i;
			}
		}
		obj[max].disp();
	}

}
