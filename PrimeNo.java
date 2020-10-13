package series;
import java.util.Scanner;

public class PrimeNo
{
    public static void main(String[] args)
    {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = Obj.nextInt();

        int temp;
        int flag = 0;
        temp = no/2;

        if(no == 0 || no == 1)
        {
            System.out.println(no + " is not prime number.");
        }
        else
        {
            for(int i=2;i<=temp;i++)
            {
                if(no % i == 0)
                {
                    System.out.println(no + " is not prime number.");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
        {
            System.out.println(no + " is prime number.");
        }
    }
}