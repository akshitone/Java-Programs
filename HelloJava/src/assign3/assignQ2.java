package assign3;

import java.util.Scanner;

class Driver
{
	private
		int vehno;
	private
		String name;
	public
		int age;
	
	Driver(int v, String n, int a)
	{
		vehno = v;
		name = n;
		age = a;
	}
}

class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}

public class assignQ2
{
	public static void main(String[] args)
	{
		Driver d  = new Driver(100, "A", 12);
		
		if(d.age < 18)
		{
			try
			{
				throw new MyException("Age Not Within the Range.");
			}
			catch(MyException e)
			{
				System.out.println(e);
			}
		}
		
		else
			System.out.println("Age is above 18.");
	}
}
