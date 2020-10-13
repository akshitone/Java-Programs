package college;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,i,j,sum=0;
		System.out.println("enter the range");
		a=sc.nextInt();
		for(j=1;j<=a;j++)
		{
			sum=0;
			
		for(i=1;i<j;i++)
		{
			if(j%i==0)
			{
				sum+=i;
			}
		}
		if(sum==i)
		{
			System.out.println(sum);
		}
		
		}
		}

}
