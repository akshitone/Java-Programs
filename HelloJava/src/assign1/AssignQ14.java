package assign1;

import java.util.Scanner;

import package1.*;

class BookDetails
{
	Book k = new Book();

	void accept()
	{		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of book: ");
		k.bookName = sc.next();
			
		System.out.println("Enter the name of book: ");
		k.authorName = sc.next();
			
		System.out.println("Enter the name of book: ");
		k.price = sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Name of Book: " + k.bookName);
		System.out.println("Author of Book: " + k.authorName);
		System.out.println("Price of Book: " + k.price);
	}
}

public class AssignQ14
{
	public static void main(String[] args)
	{
		Book[] b = new Book[5];
		
		
	}
}
