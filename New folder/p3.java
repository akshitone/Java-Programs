package college;
import java.util.Scanner;
public class p3 {

	public static void main(String[] args) {
	   Scanner s= new Scanner(System.in);
	   int n,a=0,b=1,c,i;
	   System.out.println("Enter the no of element to print fibonacci");
	   n=s.nextInt();
	   System.out.print(a);
	   System.out.print("\t"+b);
	   for(i=2;i<n;i++)
	   {
		   c=a+b;
		   System.out.print("\t"+c);
		   a=b;
		   b=c;
	   }

	}

}
