package exception;

public class TrowsExample 
{
    public void sum(int a,int b)throws ArithmeticException,StringIndexOutOfBoundsException
    {
    	int sum=a+b;
    	System.out.println(sum);
    	if(sum>15)
    	{
    		throw new ArithmeticException();
    	}
    	else
    	{
    		throw new StringIndexOutOfBoundsException();
    	}
    }
	public static void main(String[] args) 
	{
		TrowsExample trowsexample=new TrowsExample ();
		trowsexample.sum(10, 2);
	}

}
//nonchecked