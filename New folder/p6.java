package college;
import java.util.Scanner;
public class p6 {

	public static void main(String[] args) {
	account obj=new account();
	obj.accept();
	obj.display();
	obj.withdraw();
	obj.show();
	obj.deposit();
	obj.show();
		
	}

}
class account
{
	int acno;
	String atype;
	String aname;
	int bal, a;
	Scanner s=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter the account no");
		acno=s.nextInt();
		System.out.println("Enter the account type");
		atype=s.nextLine();
		System.out.println("Enter the customer name");
		aname=s.nextLine();
		System.out.println("Enter the account balance");
		bal=s.nextInt();
		
	}
	
	void deposit()
	{
		System.out.println("Enter the amount to deposit");
		a=s.nextInt();
		bal=bal+a;
	}
	void withdraw()
	{
		System.out.println("Enter the amount to withdraw");
		a=s.nextInt();
		bal=bal-a;
		
	}
	void show()
	{
		System.out.println("Enter the account balance"+bal);
	}
	void display()
	{
		System.out.println("Enter the account no"+acno);
		System.out.println("Enter the account Type"+atype);
		System.out.println("Enter the customer name"+aname);
		System.out.println("Enter the account balance"+bal);
	}
}