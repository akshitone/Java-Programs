package college;
import java.util.Scanner;
public class p31 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		try {
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("number can not divisible by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("number should contain value");
		}
		catch(Exception e)
		{
			System.out.println("there is an exception");
		}
	}

}
