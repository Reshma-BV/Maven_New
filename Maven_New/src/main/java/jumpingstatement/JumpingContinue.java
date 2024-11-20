package jumpingstatement;

public class JumpingContinue 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//java continue statement is used to continue the loop,it continues the current flow of the program and skips the remaining code at the specified condition.
			}
			System.out.println(i);
		}
	}

}
