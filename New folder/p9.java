package college;
import java.util.Scanner;
public class p9 {

	public static void main(String[] args) {
	computer obj=new computer();
	obj.display();
	laptop obj1=new laptop();
	obj1.display();

	}

}
class computer
{
 String s;
 computer()
 {
	 s="computer class";
	 
 }
 void display()
 {
	System.out.println(s);
	
 }
}
class laptop
{
	String s1;
	laptop()
	{
		s1="laptop class";
	}
	void display()
	{
		System.out.println(s1);
	}
}