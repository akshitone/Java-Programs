package assign3;

import java.util.Scanner;

class NoEqualException extends Exception
{
	NoEqualException(String s)
	{
		super(s);
	}
}

public class assignQ4
{
	public static void main(String[] args)
	{
		float i;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of i: ");
		i = s.nextFloat();
		
		if(i != 3.14)
		{
			try
			{
				throw new NoEqualException("Its not value of PIE.");
			}
			catch(NoEqualException e)
			{
				System.out.println(e);
			}
		}
		
		else
			System.out.println("Value of PIE is: " + i);
	}
}
