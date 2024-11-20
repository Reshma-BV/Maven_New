package exception;

public class Sample 
{
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		int arr[]=new int[3];
		//System.out.println(arr[5]);
		try
		{
		int d=5/0;
		System.out.println(arr[5]);
		}
		catch(ArithmeticException e) //exception variable
		{
			//System.out.println(e);
			System.out.println("Print");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block will always executed");
		}
		System.out.println("exception handling testCntrlshiftf");
	}

}
