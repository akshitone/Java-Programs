package college;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		student st=new student();
		faculty f=new faculty();
		st.get1();
		st.display1();
		f.get2();
		f.display2();
	}

}
class person
{
	Scanner s= new Scanner(System.in);
	public int pid;
	public String pname;
	void get()
	{
		System.out.println("Enter the person id");
		pid=s.nextInt();
		System.out.println("Enter the person name");
		pname=s.next();
		
	}
	void display()
	{
		System.out.println("person id="+pid);
		System.out.println("person name "+pname);
	}
}
class student extends person
{
	Scanner s=new Scanner(System.in);
	String cname;
	int fee;
	void get1()
	{
		get();
	System.out.println("Enter course name");
	cname=s.next();
	System.out.println("Enter the fee amount");
	fee=s.nextInt();
	}
	void display1()
	{
		display();
		System.out.println("course name"+cname);
		System.out.println("fee amount "+fee);
	}
}
class faculty extends person
{
	Scanner s=new Scanner(System.in);
	int exp;
	String sname;
	void get2()
	{
		get();
	System.out.println("Enter the subject name");
	sname=s.next();
	System.out.println("Enter the experience");
	exp=s.nextInt();
	}
	void display2()
	{
		display();
		System.out.println("Subject name"+sname);
		System.out.println("Experience"+exp);
	}
}