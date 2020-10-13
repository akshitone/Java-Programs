package college;
import java.util.Scanner;
public class p26 {

	public static void main(String[] args) {
		int n,i,max;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of terms");
		n=s.nextInt();
	manager a[]=new manager[n];
	max=a[0].ts;
	for(i=0;i<n;i++)
	{
	if(max<a[i].ts)
	{
		max=a[i].ts;
	}
	}
	System.out.println("Maximum salary= "+max);

	}

}
class employee
{
	Scanner s=new Scanner(System.in);
	private	int id;
    private String name,dept;
    public int sal;
    void accept()
    {
    	System.out.println("Enter the Employee id, name, department and salary");
    	id=s.nextInt();
    	name=s.next();
    	dept=s.next();
    	sal=s.nextInt();
    }
    void display()
    {
    	System.out.println("employee id= "+id);
    	System.out.println("Employee Name= "+name);
    	System.out.println("Employee department= "+dept);
    	System.out.println("Employee salary= "+sal);
    }
    
}
class manager extends employee
{
	Scanner s=new Scanner (System.in);
	private int bonus;
	public int ts;
	void accept1()
	{
		accept();
		System.out.println("enter the bonus");
		bonus=s.nextInt();
		ts=sal+bonus;
	}
	void display1()
	{
		display();
		System.out.println("bonu= "+bonus);
		System.out.println("Total Salary"+ts);
	}
}