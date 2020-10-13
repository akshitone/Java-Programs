package assign1;

import java.util.Scanner;

class ArrayFind
{
	private
		int a[] = new int[5];
	
	public
		Scanner sc = new Scanner(System.in);
		
		void input()
		{
			System.out.println("Enter the elements of array: ");
			for(int i=0; i<5; i++)
			{
				a[i] = sc.nextInt();
			}
		}
		
		int findMax()
		{
			int max = a[0];
			for(int i=1; i<5; i++)
			{
				if(max < a[i])
					max = a[i];
			}
			return max;
		}
		
		int findMin()
		{
			int min = a[0];
			for(int i=1; i<5; i++)
			{
				if(min > a[i])
					min = a[i];
			}
			return min;
		}
}
public class AssignQ8
{
	public static void main(String[] args)
	{
			ArrayFind a = new ArrayFind();
			a.input();
			
			int n = a.findMax();
			System.out.println("Max element is: " + n);
			
			int m = a.findMin();
			System.out.println("Min element is: " + m);
	}
}
