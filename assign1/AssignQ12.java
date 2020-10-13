package assign1;

import java.util.Scanner;

class Prime
{
	private 
		int n;
	
	void printPrimeSeries()
	{
		int i, flag=0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		
		for(i=3; i<=n-2; i++)
		{
			if(i % 2 == 0)
				i++;
			else
			{
				int j = 2;
				while(i > j)
				{
					if(i % j == 0)
						flag = 1;
					else
					{
						j++;
					}
				}
			}
			if(flag == 0)
				System.out.print(i + " ");
		}
	}
}

class Fibonacci
{
	private
		int a=0, b=1;
	private
		int result;
	
	void Series()
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		while(n-2>0)
		{
			result = a + b;
			a = b;
			b = result;
			
			System.out.print(result + " ");
			
			n--;
		}
	}
}

class SquareOfNumbers
{
	private 
		int lb, ub,  result;
	
	void CalcSq()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("Enter the value of lower bound: ");
		lb = sc.nextInt();
		
		System.out.println("Enter the value of upper bound: ");
		ub = sc.nextInt();
	
		for(int i=lb; i<=ub; i++)
		{
			result = i * i;
			System.out.print(result + " ");
		}
	}
}

public class AssignQ12
{
	public static void main(String[] args)
	{
		Prime p = new Prime();
		p.printPrimeSeries();
		
		Fibonacci f = new Fibonacci();
		f.Series();
		
		SquareOfNumbers s = new SquareOfNumbers();
		s.CalcSq();
	}
}
