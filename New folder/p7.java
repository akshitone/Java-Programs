package college;
import java.util.Scanner;
public class p7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,n,max,min;
		System.out.println("Enter the no of element");
		n=s.nextInt();
		int[] a;
		a= new int[n];
		System.out.println("Enter the element");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
        max=a[0];
        min=a[0];
        for(i=0;i<n;i++)
        {
        	if(max<a[i])
        		max=a[i];
        	else if(min>a[i])
        		min=a[i];
        }
        System.out.println("max element"+max);
        System.out.println("min element"+ min);
	}

}
