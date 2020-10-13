package college;
import java.util.Scanner;
public class p8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m,n;
		System.out.println("Enter the no of element m*n");
		m=s.nextInt();
		n=s.nextInt();
		int a[][];
		a=new int[m][n];
		int b[][];
		b=new int[m][n];
		int c[][];
		c=new int[m][n];
		System.out.println("Enter the element of first matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=s.nextInt();
		}
		System.out.println("Enter the element of second matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				b[i][j]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=0;
				for(int k=0;k<n;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
		}
		System.out.println("multiplication matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			System.out.println(c[i][j]);
		}

	}

}
