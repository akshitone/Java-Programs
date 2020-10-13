interface Shape
{
    public void Draw(int no1,int no2);
}
class Rectangle implements Shape
{
    public void Draw(int l,int b)
    {
        int res = l*b;
        System.out.println("Rectangle : " + res);
    }
}
class Tringle implements Shape
{
    public void Draw(int a,int b)
    {
        System.out.println("This is Tringle");
    }
}
class Hexagon implements Shape
{
    public void Draw(int a,int b)
    {
        System.out.println("This is Hexagon");
    }
}
public class DrawShape
{
    public static void main(String args[])
    {
        Shape obj1 = new Rectangle();
        obj1.Draw(10,20);
        Shape obj2 = new Tringle();
        obj2.Draw(5,10);
        Shape obj3 = new Hexagon();
        obj3.Draw(10,40);
    }
}