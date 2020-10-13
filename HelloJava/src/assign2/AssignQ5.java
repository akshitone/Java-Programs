package assign2;

import java.util.Scanner;

class Vehicle
{
	String company;
	int price;
	
	Vehicle(String c, int p)
	{
		company = c;
		price = p;
	}
}

class LightMotorVehicle extends Vehicle
{
	int mileage;
	
	LightMotorVehicle(String s, int p, int m)
	{
		super(s, p);
		mileage = m;
	}
	
	void display()
	{
		System.out.println("Vehicle information is: " + company + " " + price + " " + mileage);
	}
}

class HeavyMotorVehicle extends Vehicle
{
	int capacity;
	
	HeavyMotorVehicle(String s, int p, int c)
	{
		super(s, p);
		capacity = c;
	}
	
	void display()
	{
		System.out.println("Vehicle information is: " + company + " " + price + " " + capacity);
	}
}

public class AssignQ5
{
	public static void main(String[] args)
	{
		
		String str, s;
		int p, m, c;
		
		Scanner sc = new Scanner(System.in);
		
		LightMotorVehicle l[] = new LightMotorVehicle[2];
		HeavyMotorVehicle h[] = new HeavyMotorVehicle[2];

				
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter the type of vehicle: ");
			s = sc.next();
			
			if(s.equalsIgnoreCase("light"))
			{
				System.out.println("Enter the company name: ");
				str = sc.next();
				System.out.println("Enter the price: ");
				p = sc.nextInt();
				System.out.println("Enter the mileage: ");
				m = sc.nextInt();
				
				l[i] = new LightMotorVehicle(str, p, m);				
			}
			
			else if(s.equalsIgnoreCase("heavy"))
			{
				System.out.println("Enter the company name: ");
				str = sc.next();
				System.out.println("Enter the price: ");
				p = sc.nextInt();
				System.out.println("Enter the capacity: ");
				c = sc.nextInt();
				
				h[i] = new HeavyMotorVehicle(str, p, c);
			}
			else
				System.out.println("Input invalid...");
		}
		
		System.out.println("Vehicle Information Display-: ");
		for(int i=0; i<2; i++)
		{
			System.out.println("Which vehicle information to display ? ");
			s = sc.next();
			
			if(s.equalsIgnoreCase("light"))
			{
				l[i].display();
			}
			
			else if(s.equalsIgnoreCase("heavy"))
			{
				h[i].display();
			}
			else
				System.out.println("Invalid Input...");
		}
	}
}