package assign1;

import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int a=0, b=1, result, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i=0; i<n-2; i++)
		{
			result = a + b;
			a = b;
			b = result;
			
			System.out.print(result + " ");
		}
	}
}
