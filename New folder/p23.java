package college;

public class p23 {

	public static void main(String[] args) {
		rect obj1=new rect();
		obj1.drawshape();
		triangle obj2=new triangle();
		obj2.drawshape();
		hexagon obj3=new hexagon();
		obj3.drawshape();

	}

}
interface shape
{
 void drawshape();	
}
class rect implements shape
{
	public void drawshape()
	{
		System.out.println("Class rectangle");
	}
}
class triangle implements shape
{
	public void drawshape()
	{
		System.out.println("Class triangle");
	}
}
class hexagon implements shape
{
	public void drawshape()
	{
		System.out.println("Class hexagon");
	}
}