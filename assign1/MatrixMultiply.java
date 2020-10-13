package assign1;

import java.util.Scanner;

public class MatrixMultiply
{
	public static void main(String[] args)
	{
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter elements of array a: ");
		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of array b: ");
		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Product of matrices is: ");
		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				c[i][j] = 0;
				
				for(int k=0; k<2; k++)
				{
					c[i][j] = c[i][j] +  a[i][k] * b[k][j];
				}	
				System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
