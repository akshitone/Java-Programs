package college;
import java.util.Scanner;
public class p12 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the student roll, name and percentage");
		int r;
		String n;
		float p;
		r=s.nextInt();
		n=s.next();
		p=s.nextFloat();
		student1 obj=new student1(r,n,p);
        obj.display();
	}

}
class student1
{
	
	int rol;
	String name;
	float per;
	student1(int a,String b,float c)
	{
		rol=a;
		name=b;
		per=c;
	}
	void display()
	{
		System.out.println("student roll no"+rol);
		System.out.println("Student name"+name);
		System.out.println("student percentage"+per);
	}
	
}
