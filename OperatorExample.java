public class OperatorExample
{
    public static void main(String args[])
    {
        int a = 2;
        int b = 5;
        int min = (a<b) ? a : b;
        System.out.println(min);
        short x = 10;
        short y = 10;
        x = (short)(x+y);
        System.out.println(x);
    }
}