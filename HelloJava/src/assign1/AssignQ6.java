package assign1;

class MyNumber
{
	private
		int data;
	
	public
		MyNumber()
		{
			data = 0;
		}
		
		MyNumber(int data)
		{
			this.data = data;
		}
		
		void isNegative()
		{
			if(data < 0)
				System.out.println("Its Negative");
		}
		
		void isPositive()
		{
			if(data > 0)
				System.out.println("Its Positive");
		}
		
		void isZero()
		{
			if(data == 0)
				System.out.println("Its Zero");
		}
		
		void isOdd()
		{
			if(data % 2 != 0)
				System.out.println("Its Odd");
		}
		
		void isEven()
		{
			if(data % 2 == 0)
				System.out.println("Its Even");
		}
}
public class AssignQ6
{
	public static void main(String[] args)
	{
		MyNumber m = new MyNumber(10);
		m.isNegative();
		m.isPositive();
		m.isZero();
		m.isOdd();
		m.isEven();
	}
}
