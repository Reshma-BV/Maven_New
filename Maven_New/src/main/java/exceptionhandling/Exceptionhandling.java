package exceptionhandling;

public class Exceptionhandling 
{
	public void sum(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
		if(sum>15)
		{
			throw new ArithmeticException("exception occured");
			
		}
		else
		{
			throw new NullPointerException("null pointer");
			//System.out.println(sum);
		}
	}
	public static void main(String[] args)
	{
		Exceptionhandling exceptionhandling=new Exceptionhandling ();
		try
		{
		exceptionhandling.sum(10, 2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
