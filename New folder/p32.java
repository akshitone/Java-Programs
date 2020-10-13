package college;
import java.util.Scanner;
public class p32 {

	public static void main(String[] args) {
		driver obj=new driver();
		obj.get();
        
	}

}
class driver
{
	int vehno,age;
	String name;
	Scanner sc= new Scanner (System.in);
	void get()
	{
	System.out.println("Enter the Driver vehicle no,anme and age");
	vehno=sc.nextInt();
	name=sc.next();
    age=sc.nextInt();
    try
    {
    	check(age);
    }
    catch(Exception m) 
    {
    	System.out.println("Exception ocurred"+m);
    }
    System.out.println("Rest of the code");
	}
    static void check(int a) throws InvalidageException
	{
		if(a<18)
			throw new InvalidageException("not valid age");
		else
			System.out.println("valid age");
	}
}
class InvalidageException extends Exception
{
	InvalidageException(String s)
	{
		super(s);
	}
}