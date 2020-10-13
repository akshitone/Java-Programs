package assign1;

import java.util.Scanner;

public class PerfectCheck
{
	public static void main(String[] args)
	{
		int num, rem, sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			rem = num % i;
			if(rem == 0) {
				sum = sum + i;
			}
		}
		if(sum == num) 
			System.out.println(num + " is Perfect Number.");	
		else
			System.out.println(num + " is not Perfect Number.");
	}
}
