package assign2;

interface Shape
{
	void drawShape();
}

class Rectangle implements Shape
{
	public void drawShape()
	{
		System.out.println("Its Rectangle");
	}
}

class Triangle implements Shape
{
	public void drawShape()
	{
		System.out.println("Its Triangle");
	}
}

class Hexagon implements Shape
{
	public void drawShape()
	{
		System.out.println("Its Hexagon");
	}
}

public class AssignQ3
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		
		r.drawShape();
		t.drawShape();
		h.drawShape();
		
	}
}
