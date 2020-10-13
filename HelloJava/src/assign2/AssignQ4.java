package assign2;

import java.util.Scanner;

abstract class Shapes
{
	void calcArea() {}
	
	void CalcVolume() {}
}

class Sphere extends Shapes
{
	private
		double rad;
	
	void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		rad = sc.nextDouble();
	}
	void calcArea()
	{
		double area = 4 * 3.14 * rad * rad;
		System.out.print(area + " ");
	}
	
	void calcVolume()
	{
		double volume = 4/3 * 3.14 * rad * rad * rad;
		System.out.print(volume + " ");
	}
}

class Cone extends Shapes
{
	private
		double rad, h, l;
	
	void input() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		rad = sc.nextDouble();
		
		System.out.println("Enter the height: ");
		h = sc.nextDouble();
		
		System.out.println("Enter the slant height: ");
		l = sc.nextDouble();
	}
	
	void calcArea()
	{
		double area = (3.14 * rad * rad) + (3.14 * rad * l);
		System.out.print(area + " ");
	}
	
	void calcVolume()
	{
		double volume = 1/3 * 3.14 * rad * rad * h;
		System.out.print(volume + " ");
	}
}

class Cylinder extends Shapes
{
	private
		double rad, h;
	
	void input() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		rad = sc.nextDouble();
		
		System.out.println("Enter the height: ");
		h = sc.nextDouble();
	}
	
	void calcArea()
	{
		double area = 2 * 3.14 * rad * (rad + h);
		System.out.print(area + " ");
	}
	
	void calcVolume()
	{
		double volume = 3.14 * rad * rad * h;
		System.out.print(volume + " ");
	}
}

class Box extends Shapes
{
	private
		double l, b, h;
	
	void input() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		l = sc.nextDouble();
		
		System.out.println("Enter the breadth: ");
		b = sc.nextDouble();
		
		System.out.println("Enter the height: ");
		h = sc.nextDouble();
	}
	
	void calcArea()
	{
		double area = 2*(l*b + b*h + h*l);
		System.out.print(area + " ");
	}
	
	void calcVolume()
	{
		double volume = l * b * h;
		System.out.print(volume + " ");
	}
}

public class AssignQ4
{
	public static void main(String[] args)
	{
		Sphere s  = new Sphere();
		Cone c  = new Cone();
		Cylinder d  = new Cylinder();
		Box b  = new Box();

		s.input();
		c.input();
		d.input();
		b.input();

		s.calcArea();
		c.calcArea();
		d.calcArea();
		b.calcArea();

		s.calcVolume();
		c.calcVolume();
		d.calcVolume();
		b.calcVolume();
	}
}
