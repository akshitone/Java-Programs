package assign1;

import java.util.Scanner;

class Account
{
	private
		int accNo, balance, deposit, withdraw;
	private
		String custName, accType;
	
	public 
		Account(int accNo, int balance, String custName, String accType)
		{
			this.accNo = accNo;
			this.balance = balance;
			this.custName = custName;
			this.accType = accType;
		}
	
		Scanner sc = new Scanner(System.in);
	
		void deposit()
		{
			System.out.println("How much money to deposit ?: ");
			deposit = sc.nextInt();
		}
		
		void withdraw()
		{
			System.out.println("How much amount to withdraw ?: ");
			withdraw = sc.nextInt();	
		}
		
		void showDetails()
		{
			System.out.println("Account No. of customer is: " + accNo);
			System.out.println("Customer Name is: " + custName);
			System.out.println("Account Type is: " + accType);
		}
		
		void showBalance()
		{
			balance = balance + deposit - withdraw;
			System.out.println("The bank balance is: " + balance);
		}
	
}
public class AssignQ7
{
	public static void main(String[] args)
	{
		Account a = new Account(100, 100000, "Sudarshan", "Savings");
		a.deposit();
		a.withdraw();
		a.showDetails();
		a.showBalance();
	}
}
