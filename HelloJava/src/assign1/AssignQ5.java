package assign1;

class Employee 
{
	int id, sal;
	String name, desgtn;
	
	Employee(int EmpId, String Name, String Designation, int Salary)
	{
		id = EmpId;
		name = Name;
		desgtn = Designation;
		sal = Salary;
	}
	
	void display()
	{
		System.out.println("Employee id is : " + id);
		System.out.println("Employee name is : " + name);
		System.out.println("Employee designation is : " + desgtn);
		System.out.println("Employee salary is : " + sal);
	}
}

public class AssignQ5
{
	public static void main(String[] args)
	{
		Employee e = new Employee(100, "Sudarshan", "Developer", 100000);
		e.display();
	}
}
