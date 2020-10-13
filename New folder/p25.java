package college;
import java.util.Scanner;
public class p25 {

	public static void main(String[] args) {
		lmv obj=new lmv();
		obj.accept1();
		obj.display1();
		hmv obj2=new hmv();
		obj2.accept2();
		obj2.display2();
		

	}

}
class vehicle
{
	Scanner a=new Scanner (System.in);
	String cm ;
	int price;
	void accept()
	{
		System.out.println("enter the vechicle name");
		cm=a.next();
		System.out.println("enter the price of vehicle");
		price=a.nextInt();
		
	}
	void display()
	{
		System.out.println("vehicle name is"+cm);
		System.out.println("vehicle price is"+price);
		
	}
	
}
class lmv extends vehicle
{
	Scanner a=new Scanner (System.in);
	float m;
	void accept1()
	{
		accept();
		System.out.println("enter the mileage");
		m=a.nextFloat();
		
	}
	void display1()
	{
		display();
		System.out.println("mileage"+m);
	
	}
}
class hmv extends vehicle
{
	Scanner a=new Scanner (System.in);
	float t;
	void accept2()
	{
		accept();
		System.out.println("enter the tones");
		t=a.nextFloat();
	}
	void display2()
	{
		display();
		System.out.println("tones"+t);
		
	}
}