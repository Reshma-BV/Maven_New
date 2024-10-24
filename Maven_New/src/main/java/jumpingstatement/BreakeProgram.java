package jumpingstatement;

public class BreakeProgram 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;//if the condition matches, then stop the iteration
				continue;
			}
			System.out.println(i);
		}
	}

}
