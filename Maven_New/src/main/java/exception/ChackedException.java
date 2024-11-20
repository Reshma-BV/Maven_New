package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChackedException 
{
	 public void sum(int a,int b)throws IOException,FileNotFoundException
	    {
	    	int sum=a+b;
	    	System.out.println(sum);
	    	if(sum>15)
	    	{
	    		throw new IOException();
	    	}
	    	else
	    	{
	    		throw new FileNotFoundException();
	    	}
	    }
		public static void main(String[] args) 
		{
			ChackedException ce=new ChackedException();
			try
			{
			ce.sum(10, 2);
			}
			catch(IOException e)
			{
				System.out.println("Exception handled");
			}
		}


}
