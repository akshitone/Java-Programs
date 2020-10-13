package college;
import java.util.Scanner;
public class p5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int eid,sal;
		String ena,des;
		System.out.println("enter the employee id");
		eid=s.nextInt();
		System.out.println("Enter the name");
		ena=s.next();
		System.out.println("Enter the salary");
		sal=s.nextInt();
		System.out.println("Enter the desgination");
		des=s.next();
		
		emp obj=new emp(eid,ena,des,sal);
		obj.display();

	}

}
class emp
{
	int eid,sal;
	String ename,desc;
	emp(int i,String n,String d,int ab)
	{
		eid=i;
		ename=n;
		desc=d;
		sal=ab;
		
	}
	void display()
	{
		System.out.println("employee id"+eid);
		System.out.println("employee name"+ename);
		System.out.println("employee desgination"+desc);
		System.out.println("employee salary"+sal);
	}
}