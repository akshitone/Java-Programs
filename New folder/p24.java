package college;

public class p24 {

	public static void main(String[] args) {
    sphere1 obj1=new sphere1(5);
    obj1.calarea();
    obj1.calvolume();
    cone obj2=new cone(4,5);
    obj2.calarea();
    obj2.calvolume();
    cyclinder1 obj3=new cyclinder1(4,5);
    obj3.calarea();
    obj3.calvolume();

	}

}
abstract class shape1
{
    abstract void calarea();
	abstract void calvolume();
}
class sphere1 extends shape1
{
	int r;
	sphere1(int x)
	{
	
		r=x;
	}
	void calarea()
	{
		float ar;
		ar=(float) (4*3.14*r*r);
		System.out.println("area of sphere "+ar);
	}
	void calvolume()
	{
		float v;
		v=(float) (4/3*3.14*r*r*r);
		System.out.println("volume of sphere"+v);
	}
}
class cone extends shape1
{
	int r,h;
	cone(int x,int y)
	{
		r=x;
		h=y;
	}
	void calarea()
	{
		float a;
		a=(float) (3.14*r*(r+Math.sqrt(h*h+r*r)));
		System.out.println("area of cone"+a);
	}
	void calvolume()
	{
		float v;
		v=(float)(3.14*r*r*(h/3));
		System.out.println("volume of cone"+v);
	}

	
}
class cyclinder1 extends shape1
{
	int r,h;
	cyclinder1(int x,int y)
	{
		r=x;
		h=y;
	}
	void calarea()
	{
		float a;
		a=(float) (2*3.14*r*h+2*3.14*r*r);
		System.out.println("area of cyclinder"+a);
	}
	void calvolume()
	{
		float v;
		v=(float) (3.14*r*r*h);
		System.out.println("volume of cyclinder"+v);
	}
}