package college;
import java.util.Scanner;
public class p33 {

	public static void main(String[] args) {
		acc obj=new acc();
		obj.withdraw();
		
	}

}
class acc
{
	int amount,draw;
	Scanner sc=new Scanner(System.in);
	acc()
	{
		System.out.println("Enter the account balance");
		amount=sc.nextInt();
	}
	void withdraw()
	{
		System.out.println("Enter the withdrw amount");
		draw=sc.nextInt();
		try
		{
			check();
		}
		catch (Exception m)
		{
			System.out.println("Exception accured :"+m);
		}
	}
	void check() throws BalanceislowException
	{
		if(draw>amount)
			throw new BalanceislowException("balance is low");
		else
		{
			amount=amount-draw;
			System.out.println("amount to be withdrawl"+amount);
		}
	}
}
class BalanceislowException extends Exception
{
	BalanceislowException(String s)
	{
	super(s);
	}
}