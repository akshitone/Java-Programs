package college;
import java.util.Scanner;
public class p21 {

	public static void main(String[] args) {
	  sq ob1=new sq();
	  ob1.area1();
	  circle ob2=new circle();
	  ob2.area1();
	  cube ob3=new cube();
	  ob3.area1();
	  ob3.vol();
	  sphere ob4=new sphere();
	  ob4.area1();
	  ob4.vol();
	  cyclinder ob5=new cyclinder();
	  ob5.area1();
	  ob5.vol();
	}

}
interface area
{
 void area1();	
}
interface volume
{
 void vol();
}
class sq implements area
{
	Scanner s=new Scanner(System.in);
	int a,ar;
	public void area1()
	{
		System.out.println("Enter the side of square");
		a=s.nextInt();
		ar=a*a;
		System.out.println("area of square"+ar);
	}
}
class circle implements area
{
	Scanner s=new Scanner(System.in);
	int r;
	float ar;
	public void area1()
	{
	System.out.println("Enter the radius of circle");
	r=s.nextInt();
	ar=3*(r*r);
	System.out.println("area of circle"+ar);
	}
}
class cube implements area , volume
{
	Scanner s=new Scanner(System.in);
	int a;
	float ar,vo;
	public void area1()
	{
		System.out.println("Enter the side of cube");
		a=s.nextInt();
		ar=6*a*a;
		System.out.println("area of cube"+ar);
	}
	public void vol()
	{
		vo=a*a*a;
		System.out.println("volume of cube"+vo);
	}
}
class sphere implements area ,volume
{
	Scanner s=new Scanner(System.in);
	int r;
	float ar,vo;
	public void area1()
	{
		System.out.println("Enter the radius of sphere");
		r=s.nextInt();
		ar=4*3*r*r;
		System.out.println("area of sphere"+ar);
	}
	public void vol()
	{
		vo=(float) ((4/3)*3.14*r*r*r);
		System.out.println("volume of spher"+vo);
	}
}
class cyclinder implements area , volume
{
	Scanner s=new Scanner(System.in);
	
	float  vo,r,h;
	float ar;
	public void area1()
	{
		System.out.println("Enter the radius and height of cyclinder");
		r=s.nextInt();
		h=s.nextInt();
		ar=(float) (((2*3.14)*(r*h))+((2*3.14)*(r*r)));
	}
	public void vol()
	{
		vo=3*(r*r*h);
		System.out.println("volume of cyclinder"+vo);
	}
}