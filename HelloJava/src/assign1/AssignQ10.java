package assign1;

class Student
{
	private
		int rollNo, percent;
	private
		String name;
	private
		static int count=0;
	
	Student()
	{
		rollNo = 0;
		percent = 0;
		name = null;
		
		count++;
	}
	
	Student(int r, int p, String n)
	{
		rollNo = r;
		percent = p;
		name = n;
	
		count++;
	}
	
	void display()
	{
		System.out.println("Roll no. of Student is: " + rollNo);
		System.out.println("Percent of Student is: " + percent + "%");
		System.out.println("Name of Student is: " + name);
		System.out.println("No. of Objects created: " + count);
	}
}
public class AssignQ10
{
	public static void main(String[] args)
	{
		new Student();
		Student s1 = new Student(37, 75, "Sudarshan");
		
		s1.display();
	}
}
