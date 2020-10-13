package series;
import java.util.Scanner;

public class SquareNo
{
    public static void main(String[] args)
    {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = Obj.nextInt();
        System.out.println("Square of Number is : " + (n*n));
    }
}