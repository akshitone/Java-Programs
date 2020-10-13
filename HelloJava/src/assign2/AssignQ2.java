package assign2;

import java.util.Scanner;

class Mobile
{
		String name;
		long mobNo;
	Mobile(long mobNo, String name)
	{
		this.mobNo = mobNo;
		this.name = name;
	}
	
	int Search(long mobNo)
	{
		if(this.mobNo == mobNo)
			return 1;
		else
			return 0;
	}
	
	int Search(String name)
	{
		if(name.equalsIgnoreCase(this.name))
			return 1;
		else
			return 0;
	}
}

public class AssignQ2
{
	public static void main(String[] args)
	{
		long no;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the information: ");
		Mobile[] m = new Mobile[5];
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter mobile no.: ");
			no=sc.nextLong();
			System.out.println("Enter name: ");
			name=sc.next();
			m[i] = new Mobile(no,name);
		}
		long num;
		System.out.println("Enter mobile no to be searched.: ");
		num=sc.nextLong();
		int o;
		for(int i=0; i<5; i++)
		{
			o=m[i].Search(num);
			if(o==1)
			{
				System.out.print("Found");
			}
		}
	}
}
