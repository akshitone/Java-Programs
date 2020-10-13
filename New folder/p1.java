package college;
import java.util.Scanner;
public class p1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("Enter the number to check the no is prime or not");
		n=s.nextInt();
		int f=0,i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				f++;
		}
		if(f==0)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");

	}

}
