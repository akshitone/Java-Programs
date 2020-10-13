package college;
import java.util.Scanner;
public class p11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a;
		a=s.nextInt();
		number x=new number(a);

	}

}
class number
{
	private float n;
	number(float x)
	{
	n=x;
	isnegative();
	ispositive();
	iszero();
	isodd();
	iseven();
	}
	void isnegative()
	{
		if(n<0)
		{
			System.out.println("Number is negative");
		}
	}
	void ispositive()
	{
		if(n>0)
		{
			System.out.println("Number is positive");
		}
	}
	void iszero()
	{
		if(n==0)
		{
			System.out.println("Number is zero");
		}
	}
	void iseven()
	{
		if(n%2==0)
			System.out.println("number is even");
	}
	void isodd() {
		if(n%2!=0)
			System.out.println("number is odd");
	}
}
