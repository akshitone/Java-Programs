package series;
import java.util.Scanner;

public class Fibonaacci
{
    public static void main(String[] args)
    {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = Obj.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println(b);
        for(int i=1;i<=n;++i)
        {
            c = a + b;
            b = a;
            a = c;
            System.out.println(a);
        }

    }
}