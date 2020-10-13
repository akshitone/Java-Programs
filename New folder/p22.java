package college;
import java.util.Scanner;
public class p22 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		mobile a[]=new mobile[5];
		for(int i=0;i<5;i++)
		{
			a[i]=new mobile();
			a[i].get();
		}
			double m;
			int f=0;
		String n;
		System.out.println("Enter the mobile no to search name");
		m=s.nextDouble();
		for(int i=0;i<5;i++)
		{
			f=a[i].search(m);
			if (f!=0)
				System.out.println("searched mobile name is"+a[i].name);
		}
		
		System.out.println("Enter the mobile Name to search the mobile no ");
		n=s.next();
		for(int i=0;i<5;i++)
		{
			f=a[i].search(n);
			if (f!=0)
				System.out.println("searched mobile name is"+a[i].mob);
		}
	}
}
class mobile
{
	Scanner s=new Scanner(System.in);
	String name;
	double mob;
	int cost;
	void get()
	{
		System.out.println("Enter the mobile name");
		name=s.next();
		System.out.println("Enter the mobile number");
		mob=s.nextDouble();
		System.out.println("Enter the cost of mobile");
		cost=s.nextInt();
		
	}
	 int  search(double x)
	{
		if(this.mob==x)
			return 1;
		else return 0;
	}
	int search(String n)
	{
		if(this.name.equalsIgnoreCase(n))
			return 1;
		else return 0;
	}
	
}