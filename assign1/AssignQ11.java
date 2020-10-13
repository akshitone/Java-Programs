package assign1;

import java.util.Scanner;

class Student1
{
	private
		int rollNo, percent;
	private
		String name;
	private
		static int count=0;
	
	Student1()
	{
		rollNo = 0;
		percent = 0;
		name = null;
		
		count++;
	}
	
	Student1(int r, int p, String n)
	{
		rollNo = r;
		percent = p;
		name = n;
	
		count++;
	}
	
	void display()
	{
		System.out.println("Roll no. of Student is: " + rollNo);
		System.out.println("Percent of Student is: " + percent + "%");
		System.out.println("Name of Student is: " + name);
		System.out.println("No. of Objects created: " + count);
	}
}
public class AssignQ11
{
	public static void main(String[] args)
	{
		int m;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
				
	}
}
