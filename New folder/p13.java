package college;
import java.util.Scanner;
public class p13 {

	public static void main(String[] args) {
		student2 obj[]=new student2[5];
		int i,j;
		for(i=0;i<5;i++)
		{
			obj[i].accept();
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				if(obj[i].per<obj[i+1].per)
				{
					sort(obj[i],obj[i+1]);
				}
			}
		}

	}
	static void sort(student2 x,student2 y)
	{
		student2 z=new student2();
		z.name=x.name;
		z.per=x.per;
		x.name=y.name;
		x.per=y.per;
		y.name=z.name;
		y.per=z.per;
	}

}
class student2
{
	Scanner s=new Scanner(System.in);
	public String name;
	public float per;
	void accept()
	{
		System.out.println("Enter the Student name and percentage");
		name=s.next();
		per=s.nextFloat();
	}
	void display()
	{
		System.out.println("Student name"+name);
		System.out.println("Student percentage"+per);
	}
	
}
