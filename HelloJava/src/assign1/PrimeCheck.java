package assign1;

import java.util.Scanner;

public class PrimeCheck
{

	public static void main(String[] args)
	{
		int x, flag;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = sc.nextInt();

        if(x == 1)
            System.out.println(x + " is neither Prime nor Composite");
        else {
            if(x > 2 && x % 2 == 0)
                System.out.println(x + " is not Prime");
            else {
                flag = 0;
                int i = 3;
                while(x > i) {
                    if(x % i == 0) {
                        flag = 1;
                        break;
                    }
                    else
                        i++;
                }
                if(flag == 0)
                    System.out.println(x + " is Prime");
                else
                    System.out.println(x + " is not Prime");
            }
        }
	}
}
