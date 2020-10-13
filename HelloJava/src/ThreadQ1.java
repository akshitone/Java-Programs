import java.util.Scanner;
import java.io.Console;

class Multi extends Thread
{	
	int s;
	
	Multi(int s)
	{
		this.s = s;
		System.out.println("Thread running: " + s);
	}
	
	public void run()
	{
		
	}
}

public class ThreadQ1
{
	public static void main(String[] args)
	{
		Multi m = new Multi(2);
		m.start();
	}
}
