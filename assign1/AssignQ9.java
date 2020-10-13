package assign1;

class Computer
{
	private
		int modelNo;
	private
		String companyName;
	private
		String computerType;
	
	Computer(int mod, String compN, String compT)
	{
		modelNo = mod;
		companyName = compN;
		computerType = compT;
	}
	
	void display()
	{
		System.out.println("Model No. is: " + modelNo);
		System.out.println("Company is: " + companyName);
		System.out.println("Computer Type is: " + computerType);
	}
}

class Laptop
{
	private
		int modelNo;
	private
		String companyName;
	private
		String laptopType;

	Laptop(int mod, String compN, String compT)
	{
	modelNo = mod;
	companyName = compN;
	laptopType = compT;
	}

	void display()
	{
	System.out.println("Model No. is: " + modelNo);
	System.out.println("Company is: " + companyName);
	System.out.println("Laptop Type is: " + laptopType);
	}
}
public class AssignQ9
{
	public static void main(String[] args)
	{
		Computer c = new Computer(100, "HP", "Gaming");
		Laptop p = new Laptop(200, "MSI", "Gaming");
		
		c.display();
		System.out.println();
		p.display();
	}
}
