package assign3;

import java.util.Scanner;

public class assignQ1
{
	public static void main(String[] args)
	{
		int a, b, t=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		
		try
		{
			t = a / b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0..." + e);
		}
		
		System.out.println("Value of t is: " + t);
	}
}
