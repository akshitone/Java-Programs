package assign3;

import java.util.Scanner;

class CheckingAccount
{
	private
		int balance, withdraw;
	
	void withdraw()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter balance and withdraw amount: ");
		balance = sc.nextInt();
		withdraw = sc.nextInt();
		
		if(withdraw > balance)
		{
			try
			{
				throw new InsufficientFundsException("Withdraw amount Invalid!!!");
			}
			catch(InsufficientFundsException e)
			{
				System.out.println(e);
			}
		}
		
		else
			System.out.println("Balance amount is: " + (balance-withdraw));
	}
}

class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String s)
	{
		super(s);
	}
}

public class assignQ3
{
	public static void main(String[] args)
	{
		CheckingAccount p = new CheckingAccount();
		p.withdraw();
	}
}
